package posutfpr.banco.ativcinco.repository;


import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Gravacao;


//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


public interface GravacaoRepository extends JpaRepository<Gravacao, Long> {
	
	Optional<Gravacao> findById(Long id);
		
}