package com.lunch.lunchit.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


//create / save 
public class UserProfileCreateDto {
	
	
	@NotBlank(message = "{E_NOT_BLANK}")
 	@Size(min = 7)
 	private String password;

	@NotBlank
   	@Size(min = 5, max = 320)
 	@Email(message = "{E_EMAIL_MALFORMED}")
 	//@UniqueEmail create annotation maybe 
 	private String email;

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

   	
   	
	public UserProfileCreateDto() {
		super();
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	private void setLastname(String lastname) {
		this.lastname = lastname;
	}



	private void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	private void setDescription(String description) {
		this.description = description;
	}



	private void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPassword() {
		return password;
	}

	

	public String getLastname() {
		return lastname;
	}



	public String getFirstname() {
		return firstname;
	}



	public String getDescription() {
		return description;
	}



	public String getPicture() {
		return picture;
	}

	
	public String getEmail() {
		return email;
	}



	@Override
	public String toString() {
		return "UserProfilCreateDto [lastname=" + lastname + ", firstname=" + firstname + ", description=" + description
				+ ", picture=" + picture + "]";
	}
	
	

}
