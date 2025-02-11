package com.example.proyecto.controllers;

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

import com.example.proyecto.models.libroModel;
import com.example.proyecto.services.libroService;

@RestController
@RequestMapping("/libro")
public class libroController {

	@Autowired
	private libroService libroService;
	
	@GetMapping
	public ArrayList<libroModel> getUser(){
		return this.libroService.getUser();
	}
	
	@PostMapping
	public libroModel saveUser(@RequestBody libroModel user) {
		return this.libroService.saveUser(user);
	}
	
	@GetMapping(path = "/{Id}")
	public Optional<libroModel> getUserById(@PathVariable Long Id){
		return this.libroService.getById(Id);
	}
	
	
	@DeleteMapping(path="/{Id}")
	public String deleteById(@PathVariable("Id") Long Id){
		boolean ok = this.libroService.deleteUser(Id);
		
		if(ok) {
			return "El autor con el Id: " + Id + " se eliminó";
		}else {
			return "Error, hay un problema para eliminar este Id";
		}
	}
	
}
