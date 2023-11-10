package com.bancodividafacil.dividafacil.adapters.out.persistence.mappers;

import org.mapstruct.Context;
import org.mapstruct.Mapper;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.ContaEntity;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.commom.Conta;

@Mapper(componentModel = "spring")
public interface ContaMapper {
	
    Conta toDomain(ContaEntity entity, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);

    ContaEntity toEntity(Conta domain, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
	
	
}
