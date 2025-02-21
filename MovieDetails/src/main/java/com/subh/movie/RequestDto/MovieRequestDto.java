package com.subh.movie.RequestDto;


import lombok.Data;

@Data
public class MovieRequestDto {
	private String moviename;
	private float rating;
	private String genre;
	private int directorid;
	private String directorname;
}
