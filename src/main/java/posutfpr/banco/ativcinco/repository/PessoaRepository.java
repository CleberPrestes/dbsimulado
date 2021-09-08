package posutfpr.banco.ativcinco.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.entity.Pessoa;


//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	Pessoa findByNomePessoa(String name);
		
}