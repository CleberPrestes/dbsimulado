package posutfpr.banco.ativcinco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import posutfpr.banco.ativcinco.entity.Gravacao;
import posutfpr.banco.ativcinco.entity.Gravadora;
import posutfpr.banco.ativcinco.entity.Musica;
import posutfpr.banco.ativcinco.repository.GravacaoRepository;
import posutfpr.banco.ativcinco.repository.GravadoraRepository;
import posutfpr.banco.ativcinco.repository.MusicaRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Atividade 6
//Cleber dos Santos Prestes de Oliveira


@Service
public class GravadoraService {

	@Autowired
	private GravadoraRepository gravadoraRepository;

	public Gravadora saveGravadora(Gravadora gravadora) {
		return gravadoraRepository.save(gravadora);
	}


}
