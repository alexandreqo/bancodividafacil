package com.bancodividafacil.dividafacil.adapters.out.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.CorrentistaEntity;
import com.bancodividafacil.dividafacil.adapters.out.persistence.mappers.CorrentistaMapper;
import com.bancodividafacil.dividafacil.application.port.out.persistence.CorrentistaPersist;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.Correntista;

@Service
@Transactional
public class CorrentistaPersistImpl implements CorrentistaPersist{


	@PersistenceContext
	private EntityManager em;

	@Autowired
	private CorrentistaMapper mapper;

	@Autowired
	private CycleAvoidingMappingContext context;

	@Override
	public Correntista criarCorrentista(Correntista correntista) {
		CorrentistaEntity entity = mapper.toEntity(correntista, new CycleAvoidingMappingContext());
		return mapper.toDomain(entity, new CycleAvoidingMappingContext());
	}

	@Override
	public Correntista atualizarCorrentista(Correntista correntista) {
		CorrentistaEntity entity = mapper.toEntity(correntista, new CycleAvoidingMappingContext());
		return mapper.toDomain(entity, new CycleAvoidingMappingContext());
	}

	@Override
	public void excluirCorrentista(Long id) {
		em.createQuery("DELETE FROM Correntista c where c.id = :id").setParameter("id", id).executeUpdate();
		
	}
	
}
