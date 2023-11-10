package com.bancodividafacil.dividafacil.adapters.out.persistence;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.CorrentistaEntity;
import com.bancodividafacil.dividafacil.adapters.out.persistence.mappers.CorrentistaMapper;
import com.bancodividafacil.dividafacil.application.port.out.persistence.CorrentistaQuery;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.commom.Correntista;

@Service
public class CorrentistaQueryimpl implements CorrentistaQuery {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private CorrentistaMapper mapper;

	@Autowired
	private CycleAvoidingMappingContext context;

	@Override
	public Correntista encontrarCorrentistaPorId(Long id) {
		CorrentistaEntity correntista = em
				.createQuery("select c from CorrentistaEntity c where c.id = :id", CorrentistaEntity.class)
				.setParameter("id", id).getSingleResult();
		return mapper.toDomain(correntista, context);
	}

	@Override
	public List<Correntista> listarTodos() {
		return em.createQuery("select c from CorrentistaEntity c", CorrentistaEntity.class).getResultList().stream()
				.map(c -> mapper.toDomain(c, context)).collect(Collectors.toList());
	}

}
