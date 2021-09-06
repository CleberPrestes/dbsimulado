package posutfpr.banco.ativcinco.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.entity.Musica;
import posutfpr.banco.ativcinco.repository.CategoriaRepository;
import posutfpr.banco.ativcinco.repository.MusicaRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Atividade 6
//Cleber dos Santos Prestes de Oliveira


@Service
public class CategoriaService {
	
	

	//@Autowired
	//private CategoriaRepository categoriaRepository;

	//public Categoria saveCategoria(Categoria categoria) {
//		return categoriaRepository.save(categoria);
//	}
	
	
	
	//Atividade 8
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private MusicaRepository musicaRepository;
	
		public Categoria saveCategoria(Categoria categoria) {
			return categoriaRepository.save(categoria);
		}
		
		
		@Transactional()
		public void saveCatAndMus(Categoria categoria, Musica musica){
		  categoriaRepository.save(categoria);
		  musica.setCategoria(categoria);
		  musicaRepository.save(musica);
		}

		

}
