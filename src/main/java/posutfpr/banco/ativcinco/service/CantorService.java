package posutfpr.banco.ativcinco.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.repository.CantorRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


@Service
public class CantorService {
	
	
	
	@Autowired
	private CantorRepository cantorRepository;
	
		public Cantor saveCantor(Cantor cantor) {
			return cantorRepository.save(cantor);
		}
		
		
	public void deleteCantorId(Long idUsuario) {
			System.out.println("Deletando cantor com id " + idUsuario);
			cantorRepository.deleteById(idUsuario);
		}
		
	
	public List<Cantor> findAllCantor() {
		return cantorRepository.findAll();
	}
	
	
	public Cantor findCantorByName(String name) {

		return cantorRepository.findByNomeCantor(name);
	}
	
	

}
