package posutfpr.banco.ativcinco.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.entity.Gravacao;
import posutfpr.banco.ativcinco.entity.Gravadora;


//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Atividade 6
//Cleber dos Santos Prestes de Oliveira


public interface GravadoraRepository extends JpaRepository<Gravadora, Long> {
		
}