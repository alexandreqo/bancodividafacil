package com.bancodividafacil.dividafacil.adapters.out.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.MovimentacaoEntity;
import com.bancodividafacil.dividafacil.adapters.out.persistence.mappers.MovimentacaoMapper;
import com.bancodividafacil.dividafacil.application.port.out.persistence.MovimentacaoPersistir;
import com.bancodividafacil.dividafacil.config.CycleAvoidingMappingContext;
import com.bancodividafacil.dividafacil.domain.commom.Movimentacao;

@Service
@Transactional
public class MovimentacaoPersistirImpl implements MovimentacaoPersistir{

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private MovimentacaoMapper mapper;

	@Autowired
	private CycleAvoidingMappingContext context;
	
	
	@Override
	public MovimentacaoEntity criarMovimentacao(Movimentacao movimentacao) {
		MovimentacaoEntity entity = mapper.toEntity(movimentacao, new CycleAvoidingMappingContext());
		return em.merge(entity);
	}

	@Override
	public void excluirMovimentacao(Long id) {
		em.createQuery("DELETE FROM movimentacao c where c.id = :id").setParameter("id", id).executeUpdate();
	}

}
