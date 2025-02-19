package com.subh.movie.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.subh.movie.RequestDto.MovieRequestDto;

@Service
public interface UserService {
	public ResponseEntity<String> saveData(MovieRequestDto request);
}
