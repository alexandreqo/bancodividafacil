package com.bancodividafacil.dividafacil.application.port.in;

import com.bancodividafacil.dividafacil.adapters.out.persistence.entities.MovimentacaoEntity;

public interface MovimentacaoUseCase {
	MovimentacaoEntity criarMovimentacao(MovimentacaoEntity movimentacao);

	void excluirMovimentacao(Long id);
}