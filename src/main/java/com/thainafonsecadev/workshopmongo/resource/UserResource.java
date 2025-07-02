package com.thainafonsecadev.workshopmongo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thainafonsecadev.workshopmongo.domain.User;
import com.thainafonsecadev.workshopmongo.service.UserService;

@RestController
@RequestMapping(value ="/users")

	public class UserResource{
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> List = service.findAll();
		return ResponseEntity.ok().body(List);
		
	}
}

	
