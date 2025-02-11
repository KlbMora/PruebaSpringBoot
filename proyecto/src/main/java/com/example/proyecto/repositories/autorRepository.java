package com.example.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto.models.autorModel;

@Repository
public interface autorRepository extends JpaRepository<autorModel, Long>{

	
	
}
