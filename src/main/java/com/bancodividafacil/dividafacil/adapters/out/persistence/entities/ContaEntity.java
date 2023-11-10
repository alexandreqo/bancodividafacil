package com.bancodividafacil.dividafacil.adapters.out.persistence.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class ContaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String agencia;

    @ManyToMany
    private Set<CorrentistaEntity> correntistas;
    
    @OneToMany(mappedBy = "conta")
    private Set<MovimentacaoEntity> movimentacoes;

}