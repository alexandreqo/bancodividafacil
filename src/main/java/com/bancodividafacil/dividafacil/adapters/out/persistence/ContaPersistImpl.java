package com.bancodividafacil.dividafacil.adapters.out.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.ContaEntity;
import com.bancodividafacil.dividafacil.adapters.out.persistence.mappers.ContaMapper;
import com.bancodividafacil.dividafacil.application.port.out.persistence.ContaPersist;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.Conta;

@Service
@Transactional
public class ContaPersistImpl implements ContaPersist {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private ContaMapper mapper;

	@Override
	public Conta criarConta(Conta conta) {
		ContaEntity entity = mapper.toEntity(conta, new CycleAvoidingMappingContext());
		entity = em.merge(entity);
		return mapper.toDomain(entity, new CycleAvoidingMappingContext());
	}

	@Override
	public Conta atualizarConta(Conta conta) {
		ContaEntity entity = mapper.toEntity(conta, new CycleAvoidingMappingContext());
		entity = em.merge(entity);
		return mapper.toDomain(entity, new CycleAvoidingMappingContext());
	}

	@Override
	public void excluirConta(Long id) {
		em.createQuery("DELETE FROM Conta c where  c.id = :id").setParameter("id", id).executeUpdate();
	}

}
