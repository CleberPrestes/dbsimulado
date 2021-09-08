package posutfpr.banco.ativcinco.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Fone;
import posutfpr.banco.ativcinco.entity.Musica;
import posutfpr.banco.ativcinco.repository.FoneRepository;
import posutfpr.banco.ativcinco.repository.MusicaRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


@Service
public class FoneService {

	@Autowired
	private FoneRepository foneRepository;

	public Fone saveFone(Fone fone) {
		return foneRepository.save(fone);
	}
	
	public void deleteFoneId(Long idFone) {
		System.out.println("Deletando musica com id " + idFone);
		foneRepository.deleteById(idFone);
	}	
	
	public List<Fone> findAllFone() {
		return foneRepository.findAll();
	}
	
	
	public Fone findFoneByNumero(String name) {

		return foneRepository.findByNumero(name);
	}
	


}
