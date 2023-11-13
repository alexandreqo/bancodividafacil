package com.bancodividafacil.dividafacil.domain;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movimentacao {
	private Long id;
	private String data;
	private TipoMovimentacao tipo;
	private BigDecimal valor;

	private Conta conta;

}