package com.lunch.lunchit.dtos;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class UserProfileDto {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
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

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPicture() {
			return picture;
		}

		public void setPicture(String picture) {
			this.picture = picture;
		}

		@Override
		public String toString() {
			return "UserProfileDto [id=" + id + ", email=" + email + ", password=" + password + ", lastname=" + lastname
					+ ", firstname=" + firstname + ", description=" + description + ", picture=" + picture + "]";
		}	    
	

}
