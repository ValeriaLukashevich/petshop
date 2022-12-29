package com.example.petshop.pet;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Resource
    private PetRepository petRepository;
    public List<Pet> getAllPets() {
        List<Pet> all = petRepository.findAll();
        return all;
    }


    public void savePet(Pet pet) {
        petRepository.save(pet);
    }

    public Pet findPetById(Integer petId) {
        Optional<Pet> petOptional = petRepository.findById(petId);
        Pet pet = petOptional.get();
        return pet;
    }

    public void save(Pet pet) {
        petRepository.save(pet);
    }
}
