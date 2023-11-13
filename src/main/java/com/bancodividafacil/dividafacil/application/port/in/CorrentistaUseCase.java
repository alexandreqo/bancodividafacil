package com.bancodividafacil.dividafacil.application.port.in;

import com.bancodividafacil.dividafacil.domain.Correntista;

public interface CorrentistaUseCase {
	Correntista criarCorrentista(Correntista correntista);

	Correntista atualizarCorrentista(Correntista correntista);

	void excluirCorrentista(Long id);
}
