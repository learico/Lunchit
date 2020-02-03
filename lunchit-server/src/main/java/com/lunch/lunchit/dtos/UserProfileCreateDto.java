package com.lunch.lunchit.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserProfileCreateDto {

	@NotBlank(message = "{E_NOT_BLANK}")
   	@Size(max = 255, message = "{E_MAX_LENGTH_EXCEEDED}")
    private String lastname;
	@NotBlank(message = "{E_NOT_BLANK}")
   	@Size(max = 255, message = "{E_MAX_LENGTH_EXCEEDED}")
    private String firstname;
	@NotBlank(message = "{E_NOT_BLANK}")
   	@Size(max = 500, message = "{E_MAX_LENGTH_EXCEEDED}")
    private String description;
   	
   	@Size(max = 155, message = "{E_MAX_LENGTH_EXCEEDED}")
    private String  picture;

   	
//
//	private void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//
//
//	private void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//
//
//	private void setDescription(String description) {
//		this.description = description;
//	}
//
//
//
//	private void setPicture(String picture) {
//		this.picture = picture;
//	}
//
//
//
//	public String getLastname() {
//		return lastname;
//	}
//
//
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//
//
//	public String getDescription() {
//		return description;
//	}
//
//
//
//	public String getPicture() {
//		return picture;
//	}



	@Override
	public String toString() {
		return "UserProfilCreateDto [lastname=" + lastname + ", firstname=" + firstname + ", description=" + description
				+ ", picture=" + picture + "]";
	}
	
	

}
