package com.subh.movie.service;



import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.subh.movie.Entity.MovieEntity;
import com.subh.movie.RequestDto.MovieRequestDto;
import com.subh.movie.RequestDto.demoRequest;


@Service
public interface UserService {
	public ResponseEntity<String> saveData(MovieRequestDto request);
	public ResponseEntity<List<MovieEntity>> FetchData(demoRequest request);
}
