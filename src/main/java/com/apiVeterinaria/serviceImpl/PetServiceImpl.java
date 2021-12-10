package com.apiVeterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiVeterinaria.model.Pet;
import com.apiVeterinaria.model.repository.PetRepository;
import com.apiVeterinaria.service.PetService;
@Service
public class PetServiceImpl implements PetService {
	
	@Autowired
	private PetRepository petRepository;

	@Override
	public void save(Pet pet) {
		petRepository.save(pet);
	}

	@Override
	public List<Pet> findAll() {
		return petRepository.findAll();
	}

	@Override
	public List<Pet> findAllByDueno(String dueno) {
		return petRepository.findAllByDueno(dueno);
	}

}
