package com.subh.sqlcheck.AuthServ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.subh.sqlcheck.GetDto.RequestDto;
import com.subh.sqlcheck.GetDto.ResponseDto;
import com.subh.sqlcheck.Repository.UserRepository;
import com.subh.sqlcheck.Repository.userData;
import com.subh.sqlcheck.services.UserServices;

public class AuthServer implements UserServices{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public ResponseDto getDetail(RequestDto request) {
		ResponseDto response=new ResponseDto();
		userData ur=userRepository.getOne(1);
		System.out.println(ur);
		response.setUserId(ur.getId());
		response.setEmailId(ur.getEmail());
		response.setPassword("*****");
		response.setUserName(ur.getUsername());
		
		return response;
	}

}
