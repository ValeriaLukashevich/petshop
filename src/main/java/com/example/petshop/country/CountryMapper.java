package com.example.petshop.country;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CountryMapper {
//    @Mapping(source = "countryName", target = "name")
//    @Mapping(source = "countryId", target = "id")
//    Country toEntity(CountryDto countryDto);

    @Mapping(source = "name", target = "countryName")
    @Mapping(source = "id", target = "countryId")
    CountryDto toDto(Country country);

    List<CountryDto> toDtos(List<Country> countries);


}