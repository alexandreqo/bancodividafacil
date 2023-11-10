package com.bancodividafacil.dividafacil.adapters.out.persistence.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class CorrentistaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String cpf;

	@ManyToMany(mappedBy = "correntistas")
	private Set<ContaEntity> contas;
}
