package com.bancodividafacil.dividafacil.application.port.out.persistence;

import com.bancodividafacil.dividafacil.domain.commom.Conta;

public interface ContaPersist {
	Conta criarConta(Conta conta);

	Conta atualizarConta(Conta conta);

	void excluirConta(Long id);
}