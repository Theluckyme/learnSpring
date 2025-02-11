package com.subh.sqlcheck.services;

import com.subh.sqlcheck.GetDto.RequestDto;
import com.subh.sqlcheck.GetDto.ResponseDto;

public interface UserServices {
	ResponseDto getDetail(RequestDto request);
}
