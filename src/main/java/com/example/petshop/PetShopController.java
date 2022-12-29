package com.example.petshop;

import com.example.petshop.pet.PetDto;
import com.example.petshop.pet.PetRequestDto;
import com.example.petshop.pet.PetResponseDto;
import com.example.petshop.pet.PetUpdate;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PetShopController {

    @Resource
    private PetShopService petShopService;

    @GetMapping("/pets")
    @Operation(summary = "get list of pets")
    public List<PetDto> getAllPets() {
        List<PetDto> allPets = petShopService.getAllPets();
        return allPets;
    }

    @PostMapping("/add")
    @Operation(summary = "add a new pet")
    public PetResponseDto addNewPet(@RequestBody PetRequestDto requestDto) {
        PetResponseDto responseDto = petShopService.addNewPet(requestDto);
        return responseDto;
    }

    @PutMapping("/change")
    @Operation(summary = "change pet info")
    public void changePet(@RequestParam Integer petId, @RequestBody PetUpdate request) {
        petShopService.updatePet(petId, request);

    }

    @GetMapping("/pet")
    @Operation(summary = "one pet info")
    public PetDto getPetInfo(@RequestParam Integer petId) {
        PetDto pet = petShopService.getPetByPetId(petId);
        return pet;
    }

}
