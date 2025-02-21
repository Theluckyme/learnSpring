package com.subh.sqlcheck.AuthServ;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.subh.sqlcheck.GetDto.RequestDto;
import com.subh.sqlcheck.GetDto.ResponseDto;
import com.subh.sqlcheck.Repository.UserRepository;
import com.subh.sqlcheck.Repository.userData;
import com.subh.sqlcheck.services.UserServices;

public class AuthServer implements UserServices{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public ResponseDto getDetail(RequestDto request) {
		ResponseDto response;
		Optional<userData> optional=userRepository.findById(request.getid());
		if(optional.isPresent()) {
			userData user=optional.get();
			response=new ResponseDto(user.getId(), user.getEmail(),user.isIsenable(), user.getPassword(), user.getUsername());
		}else {
			return null;
		}
		
		return response;

}

	@Override
	public ResponseEntity<String> InsertData(userData request) {
		userData ur=new userData();
		if(request!=null) {
			ur.setId(request.getId());
			ur.setEmail(request.getEmail());
			ur.setIsenable(request.isIsenable());
			ur.setPassword(request.getPassword());
			ur.setUsername(request.getUsername());
		}
		userRepository.save(ur);
		return new ResponseEntity<>("Entry Successful",HttpStatus.CREATED);
	}
}