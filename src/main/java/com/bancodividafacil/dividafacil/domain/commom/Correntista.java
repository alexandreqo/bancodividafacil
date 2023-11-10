package com.bancodividafacil.dividafacil.domain.commom;

import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Correntista {
	private Long id;
	private String nome;
	private String email;
	private String cpf;

	private Set<Conta> contas;
}
