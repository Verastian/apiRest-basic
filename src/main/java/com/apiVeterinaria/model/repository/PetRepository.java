package com.apiVeterinaria.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiVeterinaria.model.Pet;
@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

	List<Pet> findAllByDueno(String dueno);
}
