package posutfpr.banco.ativcinco.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.entity.Gravacao;
import posutfpr.banco.ativcinco.repository.GravacaoRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


@Service
public class GravacaoService {

	@Autowired
	private GravacaoRepository gravacaoRepository;

	public Gravacao saveGravacao(Gravacao gravacao) {
		return gravacaoRepository.save(gravacao);
	}

	
	public void deleteGravacaoId(Long idUsuario) {
		System.out.println("Deletando gravacao com id " + idUsuario);
		gravacaoRepository.deleteById(idUsuario);
	}
	
	public List<Gravacao> findAllGravacao() {
		return gravacaoRepository.findAll();
	}
	
	
	public Optional<Gravacao> findGravacaoById(Long id) {

		return gravacaoRepository.findById(id);
	}
	
	

}
