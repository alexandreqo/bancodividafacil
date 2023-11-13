package com.bancodividafacil.dividafacil.application.port.out.persistence;

import java.util.List;

import com.bancodividafacil.dividafacil.domain.Correntista;

public interface CorrentistaQuery {
    Correntista encontrarCorrentistaPorId(Long id);

	List<Correntista> listarTodos();
}
