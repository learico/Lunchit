package com.lunch.lunchit.controllers;


import javax.validation.Valid;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lunch.lunchit.dtos.UserProfileCreateDto;
import com.lunch.lunchit.dtos.UserProfileDto;
import com.lunch.lunchit.entities.UserProfile;
import com.lunch.lunchit.services.UserProfileService;


@RestController
@RequestMapping("/users")
public class UserProfileController {

	private final UserProfileService service;

    protected UserProfileController(UserProfileService service) {
	this.service = service;
    }
    
    @PostMapping("/create")
	protected void create(@Valid @RequestBody UserProfileCreateDto dto) {
		service.create(dto);
	}
   

    @GetMapping("/{id}")
    protected UserProfile getOne(@PathVariable("id") Long id) {
        return service.getOne(id);
    }

    @PutMapping("/{id}")
    protected void update(@PathVariable("id") Long id, @Valid @RequestBody UserProfileDto dto){
        service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    protected void delete(@PathVariable("id") Long id) {
    	service.delete(id);
    }

}