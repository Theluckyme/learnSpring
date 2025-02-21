package com.subh.movie.UserSave;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.subh.movie.Entity.MovieEntity;
import com.subh.movie.Entity.directorEntity;
import com.subh.movie.RequestDto.MovieRequestDto;
import com.subh.movie.RequestDto.demoRequest;
import com.subh.movie.repository.DirectorRepository;
import com.subh.movie.repository.MovieRepository;
import com.subh.movie.service.UserService;

public class MovieSave implements UserService{
	
	@Autowired
	MovieRepository movieRepository;
	@Autowired
	DirectorRepository directorRepository;
	
	@Override
	public ResponseEntity<String> saveData(MovieRequestDto request) {
		MovieEntity movieEntity=new MovieEntity();
		directorEntity directorentity=new directorEntity();
		if(request!=null) {
			movieEntity.setMoviename(request.getMoviename());
			movieEntity.setRating(request.getRating());
			movieEntity.setGenre(request.getGenre());
			movieEntity.setReleasedate(LocalDate.now());
			
			Optional<directorEntity> directorExist=directorRepository.findById(request.getDirectorid());
			if(directorExist.isPresent()) {
				directorentity=directorExist.get();
			}else {
				directorentity.setDirectorid(request.getDirectorid());
				directorentity.setDirectorname(request.getDirectorname());
			}
			movieEntity.setDirector(directorentity);
			movieRepository.save(movieEntity);
		}
		return new ResponseEntity<>("Created Successfully" , HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<MovieEntity>> FetchData(demoRequest request) {
//		MovieResponseDto response=new MovieResponseDto();
		Optional<directorEntity> directorExist=directorRepository.findById(request.getDirectorid());
		if(directorExist.isPresent()) {
			directorEntity director=directorExist.get();
			
			List<MovieEntity> movieList=movieRepository.findAll()
					.stream()
					.filter(movie ->(movie.getDirector().equals(director)))
					.collect(Collectors.toList());
			
//			for(MovieEntity movie:movieList) {
//				if(movie.getDirector().equals(director)) {
//					response.setMovieid(movie.getMovieid());
//					response.setMoviename(movie.getMoviename());
//					response.setGenre(movie.getGenre());
//					response.setRating(movie.getRating());
//					response.setReleasedate(movie.getReleasedate());
//					response.setDirectorid(director.getDirectorid());
//					response.setDirectorname(director.getDirectorname());
//				}
//			}
			return new ResponseEntity<>(movieList,HttpStatus.FOUND);
		}
		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
	

}
