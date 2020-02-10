package com.lunch.lunchit.services;


import java.util.List;

import javax.validation.Valid;
import com.lunch.lunchit.dtos.UserProfileDto;
import com.lunch.lunchit.entities.UserProfile;

public interface UserProfileService {


	public void create(@Valid UserProfileDto dto);
	
	public void update(Long id, UserProfileDto dto);
	
	public void delete (Long id);
	
	UserProfile getOne(Long id);

	List<UserProfileDto> findAllByEmail(String inputs);

	
}

