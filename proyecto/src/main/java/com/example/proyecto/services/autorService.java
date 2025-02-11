package com.example.proyecto.services;

import com.example.proyecto.models.autorModel;
import com.example.proyecto.services.autorService;
import com.example.proyecto.repositories.autorRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class autorService {

	
	@Autowired
	autorRepository autorRepository;
	
	public ArrayList<autorModel> getAutors(){
		return (ArrayList<autorModel>) autorRepository.findAll();
	}
	
	public autorModel saveUser(autorModel user) {
		return this.autorRepository.save(user);
	}
	
	public Optional<autorModel> getById(Long Id){
		return autorRepository.findById(Id);
	}
	
	public autorModel updateById(autorModel request, Long Id){
		autorModel user = autorRepository.findById(Id).get();
		user.setNombre(request.getNombre());
		user.setNacionalidad(request.getNacionalidad());
		
		return user;
	}
	
	
}
