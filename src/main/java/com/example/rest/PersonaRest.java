package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PersonaDAO;
import com.example.model.Persona;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaRest {
	
	@Autowired
	private PersonaDAO personaDao;
	
	@PostMapping("/save")
	public void save(@RequestBody Persona persona) {
		personaDao.save(persona);
	}
	
	@GetMapping("/list")
	public List<Persona> list(){
		return personaDao.findAll();
	}
	
	@DeleteMapping("/delete/{dni}")
	public void delete(@PathVariable("dni") String dni) {
		Persona perDelete = new Persona();
		perDelete.setDni(dni);
		personaDao.delete(perDelete);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Persona persona){
		personaDao.save(persona);
	}
	
	@GetMapping("/isEmployed/{dni}")
	public String isEmployed(@PathVariable("dni") String dni){
		String esEmpleado = "No es Empleado";
		Persona per = new Persona();
		per = (Persona) personaDao.findByDni(dni);
		if(per.isEsEmpleado()) {
			esEmpleado = "Si es Empleado";
		}
		return esEmpleado;
		
	}
}
