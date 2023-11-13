package com.bancodividafacil.dividafacil.adapters.out.persistence;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.ContaEntity;
import com.bancodividafacil.dividafacil.adapters.out.persistence.mappers.ContaMapper;
import com.bancodividafacil.dividafacil.application.port.out.persistence.ContaQuery;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.Conta;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ContaQueryImpl implements ContaQuery {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private ContaMapper mapper;

	@Autowired
	CycleAvoidingMappingContext context;

	@Override
	public Conta encontrarContaPorId(Long id) {
		ContaEntity entity = em.createQuery("select c from ContaEntity c where c.id = :id", ContaEntity.class)
				.setParameter("id", id).getSingleResult();
		return mapper.toDomain(entity, new CycleAvoidingMappingContext());
	}

	@Override
	public List<Conta> listarTodos() {
		return em.createQuery("select c from ContaEntity c", ContaEntity.class).getResultList().stream()
				.map(c -> mapper.toDomain(c, new CycleAvoidingMappingContext())).collect(Collectors.toList());
	}

}
