package com.example.petshop.color;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ColorMapper {

//    @Mapping(source = "furColor", target = "color")
//    @Mapping(source = "colorId", target = "id")
//    Color toEntity(ColorDto colorDto);

    @Mapping(source = "color", target = "furColor")
    @Mapping(source = "id", target = "colorId")
    ColorDto toDto(Color color);

    List<ColorDto> toDtos(List<Color> colors);


}