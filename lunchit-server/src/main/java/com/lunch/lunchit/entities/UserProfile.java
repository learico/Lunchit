package com.lunch.lunchit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Léa Limelette
 *
 */

@Entity
@Table(name = "user_profile")

public class UserProfile {

		
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id;
			
			@Column(name = "email", length = 320, nullable=false)
			private String email;
			
			@Column(name = "password", nullable=false)
			private String password;
			
			@Column(name = "firstname",length = 255, nullable=false)
			private String firstname;
			
			@Column(name = "lastname", length = 255, nullable=false)
			private String lastname;
			
			@Column(name = "description", length = 500, nullable=false)
			private String description;
					
			@Column(name = "picture", length = 155)
			private String picture;
			
			
			@Column(nullable = false, length = 20)
			@Enumerated(EnumType.STRING)
			private Role role = Role.ROLE_USER;
			
			
			public UserProfile() {
				super();
					// TODO Auto-generated constructor stub
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

			public String getFirstname() {
				return firstname;
			}

			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}

			public String getLastname() {
				return lastname;
			}

			public void setLastname(String lastname) {
				this.lastname = lastname;
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

			public Role getRole() {
				return role;
			}

			public void setRole(Role role) {
				this.role = role;
			}
			
			

			@Override
			public String toString() {
				return "UserProfile [id_user_profile=" + id + ", email=" + email + ", firstname="
						+ firstname + ", lastname=" + lastname + ", descriptionProfile=" + description
						+ ", profile_picture=" + picture + "]";
			}
}			