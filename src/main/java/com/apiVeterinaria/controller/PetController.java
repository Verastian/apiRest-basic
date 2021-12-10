package com.apiVeterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiVeterinaria.model.Pet;
import com.apiVeterinaria.service.PetService;

@RestController
@RequestMapping("/api/v1/pets")
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@PostMapping
	public void create(@RequestBody Pet pet){
		petService.save(pet);
	}
	
	@GetMapping
	public List<Pet> findAll(){
		return petService.findAll();
	}
	
	@GetMapping("/{dueno}")
	public List<Pet> findAllByDueno(@PathVariable String dueno) {
		return petService.findAllByDueno(dueno);
	}

}