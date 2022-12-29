package com.example.petshop.pet;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PetMapper {




    @Mapping(source = "type.name", target = "typeName")
    @Mapping(source = "type.id", target = "typeId")
    @Mapping(source = "country.name", target = "countryName")
    @Mapping(source = "country.id", target = "countryId")
    @Mapping(source = "color.color", target = "colorColor")
    @Mapping(source = "color.id", target = "colorId")
    @Mapping(source = "code", target = "petCode")
    @Mapping(source = "name", target = "petName")
    @Mapping(source = "id", target = "petId")
    @Mapping(source = "user.id", target = "userId")
    PetDto toDto(Pet pet);

    List<PetDto> toDtos(List<Pet> pets);


    Pet toPet(PetRequestDto requestDto);

    void updatePet(PetUpdate request,@MappingTarget Pet pet);
}