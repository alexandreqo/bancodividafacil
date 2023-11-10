package com.bancodividafacil.dividafacil.domain.commom;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movimentacao {
	private Long id;
	private String data;
	private String tipo;
	private BigDecimal valor;

	private Conta conta;

}