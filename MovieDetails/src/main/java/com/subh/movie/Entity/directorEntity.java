package com.subh.movie.Entity;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "directors")
public class directorEntity {
	
	@Id
	private int directorid;
	
	private String directorname;
	

}
