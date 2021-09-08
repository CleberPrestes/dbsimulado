package posutfpr.banco.ativcinco.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Musica;
import posutfpr.banco.ativcinco.repository.MusicaRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


@Service
public class MusicaService {

	@Autowired
	private MusicaRepository musicaRepository;

	public Musica saveMusica(Musica musica) {
		return musicaRepository.save(musica);
	}
	
	public void deleteMusicaId(Long idUsuario) {
		System.out.println("Deletando musica com id " + idUsuario);
		musicaRepository.deleteById(idUsuario);
	}	
	
	public List<Musica> findAllMusica() {
		return musicaRepository.findAll();
	}
	
	
	public Cantor findMusicaByName(String name) {

		return musicaRepository.findByTitulo(name);
	}
	


}
