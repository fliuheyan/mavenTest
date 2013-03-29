package org.maven.test.dto;

import org.springframework.stereotype.Repository;

@Repository
public class UserInfo {
	private String userName;
	private String userId;
	public UserInfo(){
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
