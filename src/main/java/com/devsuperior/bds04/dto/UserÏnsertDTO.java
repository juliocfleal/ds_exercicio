package com.devsuperior.bds04.dto;

import javax.validation.constraints.NotBlank;

import com.devsuperior.bds04.services.validation.UserInsertValid;

@UserInsertValid
public class UserÏnsertDTO extends UserDTO{
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message = "Invalid password!")
	private String password;

	public UserÏnsertDTO() {
	}
	
	public UserÏnsertDTO(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
