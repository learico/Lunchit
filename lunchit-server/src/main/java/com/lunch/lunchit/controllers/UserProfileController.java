package com.lunch.lunchit.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lunch.lunchit.dtos.UserProfileDto;
import com.lunch.lunchit.entities.UserProfile;
import com.lunch.lunchit.services.UserProfileService;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserProfileController {

	private final UserProfileService service;

    protected UserProfileController(UserProfileService service) {
	this.service = service;
    }
   
    @PostMapping("/create")
	public void create(@Valid @RequestBody UserProfileDto dto) {
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
    
    @GetMapping("/all/{inputs}")
    public @ResponseBody List<UserProfileDto> findAllByEmail(
	    @PathVariable String inputs) {
	return service.findAllByEmail(inputs);
    }
    
  
    

}