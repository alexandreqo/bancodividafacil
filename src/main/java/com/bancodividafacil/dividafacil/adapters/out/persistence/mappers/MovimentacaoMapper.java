package com.bancodividafacil.dividafacil.adapters.out.persistence.mappers;

import org.mapstruct.Context;
import org.mapstruct.Mapper;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.ContaEntity;
import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.MovimentacaoEntity;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.commom.Correntista;
import com.bancodividafacil.dividafacil.domain.commom.Movimentacao;

@Mapper(componentModel = "spring")
public interface MovimentacaoMapper {

	Movimentacao toDomain(MovimentacaoEntity entity, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
	MovimentacaoEntity toEntity(Movimentacao domain, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
	
}
