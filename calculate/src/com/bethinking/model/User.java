package com.bethinking.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="_User")
@Entity
public class User {
	private String addTime;
	private int id;
	private String password;
	private String updateTime;
	private String userName;
	
	public String getAddTime() {
		return addTime;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
