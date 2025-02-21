package com.subh.sqlcheck.Repository;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="users")
@Entity(name = "users")
public class userData {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="isenable")
	private boolean isenable;
	
	@Column(name="password")
	private String password;
	
	@Column(name="username")
	private String username;
	
	
	public userData(int id, String email, boolean isenable, String password, String username) {
		super();
		this.id = id;
		this.email = email;
		this.isenable = isenable;
		this.password = password;
		this.username = username;
	}
	public userData() {}
	
}
