package com.subh.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subh.movie.Entity.MovieEntity;
import com.subh.movie.RequestDto.MovieRequestDto;
import com.subh.movie.RequestDto.demoRequest;
import com.subh.movie.service.UserService;

@RestController
@RequestMapping("home")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("smovie")
	public ResponseEntity<String> saveMovie(@RequestBody MovieRequestDto request){
		return userService.saveData(request); 
	}
	
	@PostMapping("gmovie")
	public ResponseEntity<List<MovieEntity>> fetchMovie(@RequestBody demoRequest request){
		return userService.FetchData(request);
	}
}
