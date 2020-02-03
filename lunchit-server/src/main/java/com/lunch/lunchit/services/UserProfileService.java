package com.lunch.lunchit.services;


import java.util.List;

import javax.validation.Valid;

import com.lunch.lunchit.dtos.UserProfileCreateDto;
import com.lunch.lunchit.dtos.UserProfileDto;

public interface UserProfileService {


	public void create(UserProfileCreateDto dto);

	List<UserProfileCreateDto> findAll();
	
	public void update(Long id, UserProfileCreateDto dto);
}

