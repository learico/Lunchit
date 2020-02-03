package com.lunch.lunchit.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.lunch.lunchit.dtos.UserProfileCreateDto;
import com.lunch.lunchit.entities.UserProfile;
import com.lunch.lunchit.repo.UserProfileRepository;



@Service
public class UserProfileServiceImpl implements UserProfileService {

	private ModelMapper mapper;
	
	private final UserProfileRepository repo;
		

		public UserProfileServiceImpl( UserProfileRepository repo, ModelMapper mapper) {
			this.repo = repo;
			this.mapper = mapper;
			
		}	
		
		@Override
	    public void create(UserProfileCreateDto dto) {
		UserProfile user = mapper.map(dto, UserProfile.class);
		UserProfileRepository.create(user);
	    
		}

		@Override
		public List<UserProfileCreateDto> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void update(Long id, UserProfileCreateDto dto) {
			// TODO Auto-generated method stub
			
		}
		
			

}
