package com.lunch.lunchit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lunch.lunchit.entities.UserProfile;

public interface UserProfileRepository extends JpaRepository< UserProfile, Long>{

	UserProfile getById(long id);
	Optional<UserProfile> findByEmail (String email);

}
