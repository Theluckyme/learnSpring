package com.subh.movie.UserSave;


import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.subh.movie.Entity.MovieEntity;
import com.subh.movie.Entity.directorEntity;
import com.subh.movie.RequestDto.MovieRequestDto;
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

}
