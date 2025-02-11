package com.example.proyecto.controllers;
import com.example.proyecto.models.autorModel;
import com.example.proyecto.repositories.autorRepository;
import com.example.proyecto.services.autorService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class autorController {

	@Autowired
	private autorService autorService;
	
	@GetMapping
	public ArrayList<autorModel> getAutors(){
		return this.autorService.getAutors();
	}
	
	@PostMapping
	public autorModel saveUser(@RequestBody autorModel user) {
		return this.autorService.saveUser(user);
	}
	
	@GetMapping(path = "/{Id}")
	public Optional<autorModel> getUserById(@PathVariable Long Id){
		return this.autorService.getById(Id);
	}
	
	@PutMapping(path= "/{Id}")
	public autorModel updateUserById(@RequestBody autorModel request, @PathVariable("Id") Long Id) {
		return this.autorService.updateById(request, Id);
	}
	
}
