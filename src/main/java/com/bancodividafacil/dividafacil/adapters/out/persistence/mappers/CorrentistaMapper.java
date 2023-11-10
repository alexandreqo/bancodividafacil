package com.bancodividafacil.dividafacil.adapters.out.persistence.mappers;

import org.mapstruct.Context;
import org.mapstruct.Mapper;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.CorrentistaEntity;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.commom.Correntista;


@Mapper(componentModel = "spring")
public interface CorrentistaMapper {


	Correntista toDomain(CorrentistaEntity entity, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
	CorrentistaEntity toEntity(Correntista domain, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);

}
