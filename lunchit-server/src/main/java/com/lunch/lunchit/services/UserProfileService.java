package com.lunch.lunchit.services;


import javax.validation.Valid;

import com.lunch.lunchit.dtos.UserProfileCreateDto;
import com.lunch.lunchit.dtos.UserProfileDto;
import com.lunch.lunchit.entities.UserProfile;

public interface UserProfileService {


	public void create(@Valid UserProfileCreateDto dto);
	
	public void update(Long id, UserProfileDto dto);
	
	public void delete (Long id);
	
	UserProfile getOne(Long id);

	
	//List<UserProfileDto> getAll();
	
	//List<UserProfileCreateDto> findAll();
}

