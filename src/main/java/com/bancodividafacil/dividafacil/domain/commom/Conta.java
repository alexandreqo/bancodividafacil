package com.bancodividafacil.dividafacil.domain.commom;

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

}