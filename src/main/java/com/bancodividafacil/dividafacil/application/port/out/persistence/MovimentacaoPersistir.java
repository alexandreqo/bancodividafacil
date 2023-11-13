package com.bancodividafacil.dividafacil.application.port.out.persistence;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.MovimentacaoEntity;
import com.bancodividafacil.dividafacil.domain.Movimentacao;

public interface MovimentacaoPersistir {
	MovimentacaoEntity criarMovimentacao(Movimentacao movimentacao);

	void excluirMovimentacao(Long id);
}