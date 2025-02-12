package com.subh.sqlcheck.AuthServ;


import org.springframework.beans.factory.annotation.Autowired;


import com.subh.sqlcheck.GetDto.RequestDto;
import com.subh.sqlcheck.GetDto.ResponseDto;
import com.subh.sqlcheck.GetDto.newUserRequestDto;
import com.subh.sqlcheck.Repository.UserRepository;
import com.subh.sqlcheck.Repository.userData;
import com.subh.sqlcheck.services.UserServices;

public class AuthServer implements UserServices{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public ResponseDto getDetail(RequestDto request) {
		ResponseDto response=new ResponseDto();
		userData ur=userRepository.getById(request.getid());
		response.setUserId(ur.getId());
		response.setEmailId(ur.getEmail());
		response.setPassword(ur.getPassword());
		response.setUserName(ur.getUsername());
		
		return response;

}

	@Override
	public String InsertData(newUserRequestDto request) {
		userData ur=new userData();
		if(request!=null) {
			ur.setId(request.getId());
			ur.setEmail(request.getEmail());
			ur.setIsenable(request.isIsenable());
			ur.setPassword(request.getPassword());
			ur.setUsername(request.getUsername());
		}
		userRepository.save(ur);
		return "Entry Succesfull";
	}
}