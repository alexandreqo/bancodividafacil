package com.bancodividafacil.dividafacil.domain;

import java.math.BigDecimal;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Conta {
    private Long id;
    private String numero;
    private String agencia;
    
    private Set<Correntista> correntistas;
    
    private Set<Movimentacao> movimentacoes;
    
    public BigDecimal calcularSaldo() {
        BigDecimal saldo = BigDecimal.ZERO;
        for (Movimentacao movimentacao : this.movimentacoes) {
            if (movimentacao.getTipo() == TipoMovimentacao.CREDITO) {
                saldo = saldo.add(movimentacao.getValor());
            } else {
                saldo = saldo.subtract(movimentacao.getValor());
            }
        }
        return saldo;
    }

}