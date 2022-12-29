package com.example.petshop;

import com.example.petshop.color.Color;
import com.example.petshop.color.ColorRepository;
import com.example.petshop.country.Country;
import com.example.petshop.country.CountryRepository;
import com.example.petshop.type.Type;
import com.example.petshop.type.TypeRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class FormService {

    @Resource
    private ColorRepository colorRepository;

    @Resource
    private TypeRepository typeRepository;

    @Resource
    private CountryRepository countryRepository;


    public Color getColorId(Integer colorId) {
        Optional<Color> optionalColor = colorRepository.findById(colorId);
        Color color = optionalColor.get();
        return color;
    }

    public Type getTypeId(Integer typeId) {
        Optional<Type> optionalType = typeRepository.findById(typeId);
        Type type = optionalType.get();
        return type;
    }

    public Country getCountryId(Integer countryId) {
        Optional<Country> optionalCountry = countryRepository.findById(countryId);
        Country country = optionalCountry.get();
        return country;
    }
}
