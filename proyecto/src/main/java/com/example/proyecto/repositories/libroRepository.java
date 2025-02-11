package com.example.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto.models.libroModel;

@Repository

public interface libroRepository extends JpaRepository<libroModel, Long>{

}
