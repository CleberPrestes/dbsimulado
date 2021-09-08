package posutfpr.banco.ativcinco.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import posutfpr.banco.ativcinco.entity.Cantor;


//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


public interface CantorRepository extends JpaRepository<Cantor, Long> {

	Cantor findByNomeCantor(String name);
	
	
}