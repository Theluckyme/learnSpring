package com.subh.movie.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subh.movie.UserSave.MovieSave;
import com.subh.movie.service.UserService;

@Configuration
public class beancofig {
	@Bean
	UserService getuser() {
		return new MovieSave();
	}
}
