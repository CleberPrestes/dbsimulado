package posutfpr.banco.ativcinco.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.entity.Pessoa;
import posutfpr.banco.ativcinco.repository.CategoriaRepository;
import posutfpr.banco.ativcinco.repository.PessoaRepository;

//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Simulado
//Cleber dos Santos Prestes de Oliveira


@Service
public class PessoaService {
	

	@Autowired
	private PessoaRepository pessoaRepository;
		
		public Pessoa savePessoa(Pessoa pessoa) {
			return pessoaRepository.save(pessoa);
		}
		
		
		public void deletePessoaId(Long idUsuario) {
				System.out.println("Deletando categoria com id " + idUsuario);
				pessoaRepository.deleteById(idUsuario);
			}
		
		
		public List<Pessoa> findAllPessoa() {
			return pessoaRepository.findAll();
		}
		
				
		public Pessoa findPessoaByName(String name) {

			return pessoaRepository.findByNomePessoa(name);
		}

}
