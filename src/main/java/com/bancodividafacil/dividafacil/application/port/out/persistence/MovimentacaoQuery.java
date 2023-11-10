package com.bancodividafacil.dividafacil.application.port.out.persistence;

import java.util.List;

import com.bancodividafacil.dividafacil.domain.commom.Movimentacao;

public interface MovimentacaoQuery {
    List<Movimentacao> listarTodasMovimentacoes();
}