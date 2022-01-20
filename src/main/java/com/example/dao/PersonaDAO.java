package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer>  {

	@Query(value = "SELECT * FROM persona p WHERE p.dni like %?1", nativeQuery = true)
	Persona findByDni(String dni);
}
