package com.example.petshop.country;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CountryMapper {

    @Mapping(source = "name", target = "countryName")
    @Mapping(source = "id", target = "countryId")
    CountryDto toDto(Country country);

    List<CountryDto> toDtos(List<Country> countries);


}