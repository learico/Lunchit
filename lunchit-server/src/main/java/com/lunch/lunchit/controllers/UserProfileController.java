package com.lunch.lunchit.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lunch.lunchit.dtos.UserProfileCreateDto;
import com.lunch.lunchit.dtos.UserProfileDto;
import com.lunch.lunchit.services.UserProfileService;


@RestController
@RequestMapping("/users")
public class UserProfileController {

	private final UserProfileService service;

    protected UserProfileController(UserProfileService service) {
	this.service = service;
    }

    @PostMapping
	protected void create(@Valid @RequestBody UserProfileCreateDto user) {
		service.create(user);
	}
   
    
//   @PostMapping
//    public void save(@Valid @RequestBody UserProfileCreateDto dto) {
//	service.save(dto);
//    }
    
    
//   @GetMapping()
//	ResponseEntity<List<UserProfileCreateDto>> findAll() {
//		List<UserProfileCreateDto> item = service.findAll();
//		return new ResponseEntity<>(item, HttpStatus.OK);
//   }

	

//	@PutMapping("/{id}")
//	protected void update(@PathVariable("id") Long id, @Valid @RequestBody UserUpdateDto user) {
//
    //}
}