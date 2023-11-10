package com.bancodividafacil.dividafacil.application.port.in;

import com.bancodividafacil.dividafacil.domain.commom.Conta;

public interface ContaUseCase {
	Conta criarConta(Conta conta);

	Conta atualizarConta(Conta conta);

	void excluirConta(Long id);
}