package posutfpr.banco.ativcinco.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Categoria;


//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	Categoria findByDescCategoria(String name);
		
}