package com.example.proyecto.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.models.libroModel;
import com.example.proyecto.repositories.libroRepository;

@Service
public class libroService {

	@Autowired
	libroRepository libroRepository;
	
	public ArrayList<libroModel> getUser(){
		return (ArrayList<libroModel>) libroRepository.findAll();
	}
	
	public libroModel saveUser(libroModel user) {
		return this.libroRepository.save(user);
	}
	
	public Optional<libroModel> getById(Long Id){
		return libroRepository.findById(Id);
	}
	
	
	public Boolean deleteUser (Long Id) {
		try {
			libroRepository.deleteById(Id);
			return true;
	}catch (Exception e) {
		return false;
	}
		
	}
	
}
