package com.example.petshop.type;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TypeMapper {


    @Mapping(source = "name", target = "typeName")
    @Mapping(source = "id", target = "typeId")
    TypeDto toDto(Type type);

    List<TypeDto> toDtos(List<Type> types);


}