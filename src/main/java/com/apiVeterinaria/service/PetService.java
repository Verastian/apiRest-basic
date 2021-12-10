package com.apiVeterinaria.service;

import java.util.List;

import com.apiVeterinaria.model.Pet;


public interface PetService {

	void save(Pet pet);
	List<Pet> findAll();
	List<Pet> findAllByDueno(String dueno);
}
