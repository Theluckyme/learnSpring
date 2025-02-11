package com.subh.sqlcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.subh.sqlcheck.GetDto.RequestDto;
import com.subh.sqlcheck.GetDto.ResponseDto;
import com.subh.sqlcheck.services.UserServices;

@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserServices userServices;
	@PostMapping("req")
	public ResponseDto getData(RequestDto request) {
		return userServices.getDetail(request);
	}
}
