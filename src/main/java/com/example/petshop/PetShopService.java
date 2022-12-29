package com.example.petshop;

import com.example.petshop.color.Color;
import com.example.petshop.country.Country;
import com.example.petshop.pet.*;
import com.example.petshop.type.Type;
import com.example.petshop.user.User;
import com.example.petshop.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PetShopService {

    @Resource
    private PetService petService;

    @Resource
    private PetMapper petMapper;

    @Resource
    private UserService userService;

    @Resource
    private FormService formService;


    public List<PetDto> getAllPets() {
        List<Pet> pets = petService.getAllPets();
        List<PetDto> petDtos = petMapper.toDtos(pets);
        return petDtos;
    }

    public PetResponseDto addNewPet(PetRequestDto requestDto) {
        Integer userId = requestDto.getUserId();
        User user = userService.getUserByUserId(userId);

        Integer colorId = requestDto.getColorId();
        Color color = formService.getColorId(colorId);

        Integer typeId = requestDto.getTypeId();
        Type type = formService.getTypeId(typeId);

        Integer countryId = requestDto.getCountryId();
        Country country = formService.getCountryId(countryId);

        Pet pet = petMapper.toPet(requestDto);
        pet.setUser(user);
        pet.setColor(color);
        pet.setCountry(country);
        pet.setType(type);

        petService.savePet(pet);
        PetResponseDto responseDto = new PetResponseDto();
        responseDto.setPetId(pet.getId());
        return responseDto;

    }

    public void updatePet(Integer petId, PetUpdate request) {
        Color color = formService.getColorId(request.getColorId());
        Country country = formService.getCountryId(request.getCountryId());
        Type type = formService.getTypeId(request.getTypeId());

        Pet pet = petService.findPetById(petId);
        petMapper.updatePet(request, pet);
        pet.setColor(color);
        pet.setCountry(country);
        pet.setType(type);
        petService.save(pet);
    }

    public PetDto getPetByPetId(Integer petId) {
        Pet pet = petService.findPetById(petId);
        PetDto petDto = petMapper.toDto(pet);
        return petDto;
    }
}
