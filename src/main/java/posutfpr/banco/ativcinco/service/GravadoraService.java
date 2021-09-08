package posutfpr.banco.ativcinco.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Gravacao;
import posutfpr.banco.ativcinco.entity.Gravadora;
import posutfpr.banco.ativcinco.repository.GravadoraRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


@Service
public class GravadoraService {

	@Autowired
	private GravadoraRepository gravadoraRepository;

	public Gravadora saveGravadora(Gravadora gravadora) {
		return gravadoraRepository.save(gravadora);
	}
	
	public void deleteGravadoraId(Long idUsuario) {
		System.out.println("Deletando gravadora com id " + idUsuario);
		gravadoraRepository.deleteById(idUsuario);
	}
	
	

	public List<Gravadora> findAllGravadora() {
		return gravadoraRepository.findAll();
	}
	
	
	public Gravadora findGravadoraByName(String name) {

		return gravadoraRepository.findByNomeGravadora(name);
	}


}
