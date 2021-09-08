package posutfpr.banco.ativcinco.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.repository.CategoriaRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Simulado
//Cleber dos Santos Prestes de Oliveira


@Service
public class CategoriaService {
	

	@Autowired
	private CategoriaRepository categoriaRepository;
		
		public Categoria saveCategoria(Categoria categoria) {
			return categoriaRepository.save(categoria);
		}
		
		
		public void deleteCategoriaId(Long idUsuario) {
				System.out.println("Deletando categoria com id " + idUsuario);
				categoriaRepository.deleteById(idUsuario);
			}
				
		public Categoria findCategoriaByName(String name) {

			return categoriaRepository.findByDescCategoria(name);
		}

}
