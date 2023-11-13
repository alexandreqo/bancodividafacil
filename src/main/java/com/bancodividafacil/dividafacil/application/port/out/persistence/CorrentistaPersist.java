package com.bancodividafacil.dividafacil.application.port.out.persistence;

import com.bancodividafacil.dividafacil.domain.Correntista;

public interface CorrentistaPersist {
	Correntista criarCorrentista(Correntista correntista);

	Correntista atualizarCorrentista(Correntista correntista);

	void excluirCorrentista(Long id);
}
