package com.internship.springbootapplication.converter;

public abstract class AbstractConverter<ENTITY, DTO> {

    public abstract ENTITY toEntity(DTO dto);

    public abstract DTO toDto(ENTITY entity);

}
