package com.example.petshop;

import com.example.petshop.color.Color;
import com.example.petshop.color.ColorDto;
import com.example.petshop.color.ColorMapper;
import com.example.petshop.color.ColorRepository;
import com.example.petshop.country.Country;
import com.example.petshop.country.CountryDto;
import com.example.petshop.country.CountryMapper;
import com.example.petshop.country.CountryRepository;
import com.example.petshop.type.Type;
import com.example.petshop.type.TypeDto;
import com.example.petshop.type.TypeMapper;
import com.example.petshop.type.TypeRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FormController {

    @Resource
    private CountryMapper countryMapper;

    @Resource
    private CountryRepository countryRepository;

    @Resource
    private ColorMapper colorMapper;

    @Resource
    private ColorRepository colorRepository;
    @Resource
    private TypeRepository typeRepository;

    @Resource
    private TypeMapper typeMapper;

    public FormController(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @GetMapping("/countries")
    @Operation(summary = "get list of all countries of origin")
    public List<CountryDto> getAllCountryNames() {
        List<Country> entities = countryRepository.findAll();
        List<CountryDto> countryDtos = countryMapper.toDtos(entities);
        return countryDtos;
    }

    @GetMapping("/colors")
    @Operation(summary = "get lis of all colors of animals")
    public List<ColorDto> getAllColors() {
        List<Color> entities = colorRepository.findAll();
        List<ColorDto> colorDtos = colorMapper.toDtos(entities);
        return colorDtos;
    }

    @GetMapping("/types")
    @Operation(summary = "get list of all types of animals")
    public List<TypeDto> getAllTypeNames() {
        List<Type> entites = typeRepository.findAll();
        List<TypeDto> typeDtos = typeMapper.toDtos(entites);
        return typeDtos;

    }
}
