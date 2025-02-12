package com.subh.sqlcheck.services;

import org.springframework.stereotype.Service;

import com.subh.sqlcheck.GetDto.RequestDto;
import com.subh.sqlcheck.GetDto.ResponseDto;

@Service
public interface UserServices {
	ResponseDto getDetail(RequestDto request);
}
