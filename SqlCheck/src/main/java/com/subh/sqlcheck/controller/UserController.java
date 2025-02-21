package com.subh.sqlcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subh.sqlcheck.GetDto.RequestDto;
import com.subh.sqlcheck.GetDto.ResponseDto;
import com.subh.sqlcheck.Repository.userData;
import com.subh.sqlcheck.services.UserServices;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserServices userServices;
	
	@PostMapping("req")
	public ResponseDto getData(@RequestBody RequestDto request) {
		return userServices.getDetail(request);
	}
	
	@PostMapping("insert")
	public ResponseEntity<String> InsertValue(@RequestBody userData request) {
		return userServices.InsertData(request);
	}
}
