package com.subh.sqlcheck.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="users")
@Entity
public class userData {
	
	@Id
	@Column(name="id")
	private int id;
	private String email;
	private boolean isenable;
	private String password;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isIsenable() {
		return isenable;
	}
	public void setIsenable(boolean isenable) {
		this.isenable = isenable;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public userData(int id, String email, boolean isenable, String password, String username) {
		super();
		this.id = id;
		this.email = email;
		this.isenable = isenable;
		this.password = password;
		this.username = username;
	}
	
}
