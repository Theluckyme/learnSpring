package com.subh.movie.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "movies")
public class MovieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String movieid;
	private String moviename;
	private float rating;
	private String genre;
	private LocalDate releasedate;
	
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "directorid",referencedColumnName = "directorid")
	private directorEntity director;
}
