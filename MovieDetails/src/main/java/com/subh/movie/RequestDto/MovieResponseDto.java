package com.subh.movie.RequestDto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MovieResponseDto {
	private String movieid;
	private String moviename;
	private float rating;
	private String genre;
	private LocalDate releasedate;
	private int directorid;
	private String directorname;
}
