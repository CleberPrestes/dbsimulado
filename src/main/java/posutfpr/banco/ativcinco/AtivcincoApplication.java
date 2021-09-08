package posutfpr.banco.ativcinco;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.entity.Gravacao;
import posutfpr.banco.ativcinco.entity.Gravadora;
import posutfpr.banco.ativcinco.entity.Musica;
import posutfpr.banco.ativcinco.service.CantorService;
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

	
	public static void main(String[] args) {
		SpringApplication.run(AtivcincoApplication.class, args);

		System.out.println("The system OK !!!");

	}
	

	/*
	@Bean
	public CommandLineRunner saveEntity(MusicaService musicaService, CategoriaService categoriaService, 
			GravacaoService gravacaoService,
			GravadoraService gravadoraService, CantorService cantorService) {
		return (args) -> {
			
			
			Calendar c = Calendar.getInstance();
			c.set(2013, Calendar.FEBRUARY, 28);
			Date date = c.getTime();
			
			Calendar c1 = Calendar.getInstance();
			c.set(2021, Calendar.JANUARY, 30);
			Date date1 = c1.getTime();
			
			Calendar c2 = Calendar.getInstance();
			c.set(2021, Calendar.AUGUST, 30);
			Date date2 = c2.getTime();
	
						
			Categoria categoria1 = new Categoria("Pop");
			Categoria categoria2 = new Categoria("Rock");
			Categoria categoria3 = new Categoria("Jazz");
			categoriaService.saveCategoria(categoria1);
			categoriaService.saveCategoria(categoria2);
			categoriaService.saveCategoria(categoria3);

						
			Gravadora  gravadora1 = new Gravadora("Globo", "Brasil");
			Gravadora  gravadora2 = new Gravadora("Sony", "EUA");
			Gravadora  gravadora3 = new Gravadora("EMI", "EUA");
			gravadoraService.saveGravadora(gravadora1);
			gravadoraService.saveGravadora(gravadora2);
			gravadoraService.saveGravadora(gravadora3);
			
						
			Musica musica1 = new Musica(240l, "Amor I love you", categoria1);
			Musica musica2 = new Musica(440l, "Tempo Perdido", categoria2);
			Musica musica3 = new Musica(200l, "New York", categoria3);
			musicaService.saveMusica(musica1);
			musicaService.saveMusica(musica2);
			musicaService.saveMusica(musica3);
			
			
			
			Cantor cantor1 = new Cantor("Marisa Monte", "Brasil");
			Cantor cantor2 = new Cantor("Coldplay", "Inglaterra");
			Cantor cantor3 = new Cantor("Laura Pausini", "Italia");
			
			cantorService.saveCantor(cantor1);
			cantorService.saveCantor(cantor2);
			cantorService.saveCantor(cantor3);
			
			
			Gravacao gravacao1 = new Gravacao(date, musica1, gravadora1, cantor1);
			Gravacao gravacao2 = new Gravacao(date1, musica2, gravadora1, cantor2);
			Gravacao gravacao3 = new Gravacao(date2, musica3, gravadora1, cantor3);
			
			
			
			List<Gravacao> gravacoes = Arrays.asList(gravacao1, gravacao2, gravacao3);
			
						
			cantor1.setGravacoes(gravacoes);
			
			gravacaoService.saveGravacao(gravacao1);
			gravacaoService.saveGravacao(gravacao2);
			gravacaoService.saveGravacao(gravacao3);
			
		};

	} // fim do bean
	
	
	*/
	

		
	
	@Bean
	public CommandLineRunner findEntity(MusicaService musicaService, CategoriaService categoriaService, 
			GravacaoService gravacaoService,
			GravadoraService gravadoraService, CantorService cantorService) {
		return (args) -> {
			
					
			System.out.println("Buscando todos os cantores: ");
			for (Cantor listAllCantor : cantorService.findAllCantor()) {

				System.out.println(listAllCantor.getNomeCantor());
			}

			System.out.println("-----------------------------------------------------------------");
			
			Cantor testFunc = cantorService.findCantorByName("Coldplay");
			System.out.println("Dados do Cantor por nome: \n" 
			+ "Nome: " + testFunc.getNomeCantor() + " "
					+ "Pais: " + testFunc.getPais() + "\n");

			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando gravacoes por Id: ");
				Optional<Gravacao> gravacao = gravacaoService.findGravacaoById(13l);
				System.out.println(gravacao.get().getDataGravacao());
			System.out.println("-----------------------------------------------------------------");
		
		};

	} // fim do bean
	
	
	@Bean
	public CommandLineRunner deleteEntity(MusicaService musicaService, CategoriaService categoriaService, 
			GravacaoService gravacaoService,
			GravadoraService gravadoraService, CantorService cantorService) {
		return (args) -> {
			
				
			
			//cantorService.deleteCantorId(28l);
			
			//categoriaService.deleteCategoriaId(7l);
			
			//gravacaoService.deleteGravacaoId(23l);
		
			//gravadoraService.deleteGravadoraId(2l);
			
			//musicaService.deleteMusicaId(33l);
			
		
		};

	} // fim do bean

}
