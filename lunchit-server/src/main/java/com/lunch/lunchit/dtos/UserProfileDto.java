package com.lunch.lunchit.dtos;



import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class UserProfileDto {
	
		@Id
		private Long id;
		
	 	@NotBlank
	   	@Size(min = 5, max = 320)
	 	@Email(message = "{E_EMAIL_MALFORMED}")
	 	//@UniqueEmail create annotation maybe 
	 	private String email;
	 	
	 	@NotBlank(message = "{E_NOT_BLANK}")
	 	@Size(min = 7)
	 	private String password;
	 	
	 	@NotBlank(message = "{E_NOT_BLANK}")
	   	@Size(max = 255)
	    private String lastname;
	 	
	 	@NotBlank(message = "{E_NOT_BLANK}")	
	 	@Size(max = 255)
	    private String firstname;
	 	
	 	@NotBlank(message = "{E_NOT_BLANK}")
	   	@Size(min = 5, max = 500)
	    private String description;
	
	   	@Size(max = 155)
	    private String  picture;
	    
	   	
		public UserProfileDto() {
			super();
		}


		@Override
		public String toString() {
			return "UserProfileDto [id=" + id + ", email=" + email + ", password=" + password + ", lastname=" + lastname
					+ ", firstname=" + firstname + ", description=" + description + ", picture=" + picture + "]";
		}	    
	

}
