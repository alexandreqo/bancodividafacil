package com.bancodividafacil.dividafacil.adapters.out.persistence;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.MovimentacaoEntity;
import com.bancodividafacil.dividafacil.adapters.out.persistence.mappers.MovimentacaoMapper;
import com.bancodividafacil.dividafacil.application.port.out.persistence.MovimentacaoQuery;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.commom.Movimentacao;

@Service
public class MovimentacaoQueryImpl implements MovimentacaoQuery {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private MovimentacaoMapper mapper;

	@Autowired
	private CycleAvoidingMappingContext context;

	@Override
	public List<Movimentacao> listarTodasMovimentacoes() {
		return em.createQuery("select m from MovimentacaoEntity", MovimentacaoEntity.class).getResultList().stream()
				.map(c -> mapper.toDomain(c, context)).collect(Collectors.toList());
	}

}
