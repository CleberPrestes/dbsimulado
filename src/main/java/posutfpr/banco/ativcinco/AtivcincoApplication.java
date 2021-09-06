package posutfpr.banco.ativcinco;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.entity.Gravacao;
import posutfpr.banco.ativcinco.entity.Gravadora;
import posutfpr.banco.ativcinco.entity.Musica;
import posutfpr.banco.ativcinco.service.CategoriaService;
import posutfpr.banco.ativcinco.service.GravacaoService;
import posutfpr.banco.ativcinco.service.GravadoraService;
import posutfpr.banco.ativcinco.service.MusicaService;


//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


@SpringBootApplication
public class AtivcincoApplication {

	static String departTest;
    static int depTest;
	public static void main(String[] args) {
		SpringApplication.run(AtivcincoApplication.class, args);

		System.out.println("The system ok");
		
		
		
		

	}
	

	
//	@Bean
//	public CommandLineRunner demo(CategoriaService categoriaService) {
	//	return (args) -> {

		//	categoriaService.saveCategoria(pop);
			
			// salvando os departamentos
			
			/*
			departamentService.saveDepartament(depAdm);
			departamentService.saveDepartament(dpFinc);
			departamentService.saveDepartament(dpRH);
			departamentService.saveDepartament(dpCom);
			departamentService.saveDepartament(dpDir);
			*/
		
			// Atividade6 ex 003
		/*
			DepartamentEntity departFirst = departamentService.findFirstDep();
			System.out.println("\nNome do primeiro departamento cadastrado\n: " + departFirst.getName());
			System.out.println("-----------------------------------------------------------------");
			*/
//		};
//	}


	
	@Bean
	public CommandLineRunner demoFunc(MusicaService musicaService, CategoriaService categoriaService, 
			GravacaoService gravacaoService, GravadoraService gravadoraService) {
		return (args) -> {
			
			
			
			//Cria categoria
			Date date = new Date(1067l);
			Categoria categoria = new Categoria("Rock");
			Gravadora  gravadora = new Gravadora("Jupiter", "EUA");
			//Gravadora  gravadora2 = new Gravadora("Jupiter", "EUA");
			
			Gravacao gravacao = new Gravacao(date, gravadora);
			//Gravacao gravacao2 = new Gravacao(date, gravadora2);
			gravadoraService.saveGravadora(gravadora);
			//List<Gravacao> gravacoes = Arrays.asList(gravacao1, gravacao2);
			
			//Cria musica com a categoria
			Musica musica1 = new Musica(103l, "I miss you", categoria, gravacao);
			Musica musica2 = new Musica(10l, "We are", categoria, gravacao);
			//Gravacao gravacao = new Gravacao(date, musica1);
			
			//Cria lista de musicas e insere musicas 
			
			
			List<Musica> musicas = Arrays.asList(musica1, musica2);
			//gravacao.setMusica(musica1);
			
			List<Gravacao> gravacoes = Arrays.asList(gravacao);
			
			
			//Coloca lista na categoria
			
			categoria.setMusicas(musicas);
			gravadora.setGravacao(gravacoes);
			
			
			//Salva categoria usando service
			categoriaService.saveCategoria(categoria);
			
			//gravacaoService.saveGravacao(gravacao);
			

		};

	}

}
