package com.subh.sqlcheck.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.subh.sqlcheck.GetDto.RequestDto;
import com.subh.sqlcheck.GetDto.ResponseDto;
import com.subh.sqlcheck.Repository.userData;

@Service
public interface UserServices {
	ResponseDto getDetail(RequestDto request);
	ResponseEntity<String> InsertData(userData request);
}
