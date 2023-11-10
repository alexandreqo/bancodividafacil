package com.bancodividafacil.dividafacil.application.port.in;

import com.bancodividafacil.dividafacil.domain.commom.Correntista;

public interface CorrentistaUseCase {
	Correntista criarCorrentista(Correntista correntista);

	Correntista atualizarCorrentista(Correntista correntista);

	void excluirCorrentista(Long id);
}
