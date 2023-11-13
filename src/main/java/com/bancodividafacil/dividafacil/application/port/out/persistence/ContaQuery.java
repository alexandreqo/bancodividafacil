package com.bancodividafacil.dividafacil.application.port.out.persistence;

import java.util.List;

import com.bancodividafacil.dividafacil.domain.Conta;

public interface ContaQuery {
	Conta encontrarContaPorId(Long id);
	List<Conta> listarTodos();
}
