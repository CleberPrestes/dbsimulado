package posutfpr.banco.ativcinco;


import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import posutfpr.banco.ativcinco.entity.Cantor;
import posutfpr.banco.ativcinco.entity.Categoria;
import posutfpr.banco.ativcinco.entity.Fone;
import posutfpr.banco.ativcinco.entity.Gravacao;
import posutfpr.banco.ativcinco.entity.Gravadora;
import posutfpr.banco.ativcinco.entity.Musica;
import posutfpr.banco.ativcinco.entity.Pessoa;
import posutfpr.banco.ativcinco.service.CantorService;
import posutfpr.banco.ativcinco.service.CategoriaService;
import posutfpr.banco.ativcinco.service.FoneService;
import posutfpr.banco.ativcinco.service.GravacaoService;
import posutfpr.banco.ativcinco.service.GravadoraService;
import posutfpr.banco.ativcinco.service.MusicaService;
import posutfpr.banco.ativcinco.service.PessoaService;


//UTFPR — Universidade Tecnológica Federal do Paraná UTFPR
//XXI Curso de Especialização em Tecnologia Java (2021_01)
//Banco de Dados
//Simulado
//Cleber dos Santos Prestes de Oliveira


@SpringBootApplication
public class AtivcincoApplication {

	private static final Logger log = LoggerFactory.getLogger(AtivcincoApplication.class);
	
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
	
	/*
	@Bean
	public CommandLineRunner saveFone(FoneService foneService, PessoaService pessoaService) {
		return (args) -> {
			
			
			Pessoa pessoa1 = new Pessoa("Pedro");
			pessoaService.savePessoa(pessoa1);
			Pessoa pessoa2 = new Pessoa("Maria");
			pessoaService.savePessoa(pessoa2);
			Pessoa pessoa3 = new Pessoa("João");
			pessoaService.savePessoa(pessoa3);
			
			
			
			
			Fone fone1 = new Fone("123456789", "Comercial", pessoa1);
			foneService.saveFone(fone1);
			Fone fone2 = new Fone("987654321", "Residencial", pessoa2);
			foneService.saveFone(fone2);
			Fone fone3 = new Fone("555888999", "Celular", pessoa3);
			foneService.saveFone(fone3);
			
			
			
			
		};

	} // fim do bean
	
	*/
	
		
	
	@Bean
	public CommandLineRunner queryEntity(MusicaService musicaService, CategoriaService categoriaService, 
			GravacaoService gravacaoService, GravadoraService gravadoraService, 
			CantorService cantorService, PessoaService pessoaService, FoneService foneService) {
		return (args) -> {
			
			//Consultas no Cantor
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando todos os cantores: ");
			for (Cantor listAllCantor : cantorService.findAllCantor()) {
				System.out.println("Teste de Log: ");
				log.info(listAllCantor.getNomeCantor());
			}
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando cantor pelo nome: ");
			Cantor testFunc = cantorService.findCantorByName("Coldplay");
			log.info("Dados do Cantor por nome: \n" 
			+ "Nome: " + testFunc.getNomeCantor() + " "
					+ "Pais: " + testFunc.getPais() + "\n");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			//Consultas Categoria
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando todas as categorias: ");
			for (Categoria listAllCategoria : categoriaService.findAllCategoria()) {
				System.out.println("Teste de Log: ");
				log.info(listAllCategoria.getDescCategoria());
			}
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando categoria pela descrição: ");
			Categoria categoria = categoriaService.findCategoriaByName("Pop");
			log.info("Dados categoria pela descrição:: \n" 
			+ "Descrição: " + categoria.getDescCategoria() + " "
					+ "Id: " + categoria.getId() + "\n");
			System.out.println("-----------------------------------------------------------------");
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			//Consultas Gravacao
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando todas as gravacoes: ");
			for (Gravacao listAllGravacoes : gravacaoService.findAllGravacao()) {
				System.out.println("Teste de Log: ");
				log.info(listAllGravacoes.getClass().toString());
			}
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando gravacao pelo Id: ");
			Optional<Gravacao> gravacao = gravacaoService.findGravacaoById(13l);
			log.info("Dados da gravacao por Id: \n" 
			+ "Descrição: " + gravacao.get().toString() + " "
					+ "Id: " + gravacao.get().getId() + "\n");
			System.out.println("-----------------------------------------------------------------");
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			//Consultas Gravadora
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando todas as gravadoras: ");
			for (Gravadora listAllGravadoras : gravadoraService.findAllGravadora()) {
				System.out.println("Teste de Log: ");
				log.info(listAllGravadoras.getNomeGravadora());
			}
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando gravadoras pelo Id: ");
			Gravadora gravadoras = gravadoraService.findGravadoraByName("Sony");
			log.info("Dados da gravadora por Nome: \n" 
			+ "Nome: " + gravadoras.getNomeGravadora() + " "
					+ "Pais: " + gravadoras.getPais() + "\n");
			System.out.println("-----------------------------------------------------------------");
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			//Consultas Musicas
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando todas as musicas: ");
			for (Musica listAllMusicas : musicaService.findAllMusica()) {
				System.out.println("Teste de Log: ");
				log.info(listAllMusicas.getTitulo());
			}
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando musicas pelo titulo: ");
			Musica musicas = musicaService.findMusicaByName("Tempo Perdido");
			log.info("Dados da musica por titulo: \n" 
			+ "Titulo: " + musicas.getTitulo() + " "
					+ "Duracao: " + musicas.getDuracao() + "\n");
			System.out.println("-----------------------------------------------------------------");
			
			//Consultas Pessoas
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando todas as pessoas: ");
			for (Pessoa listAllPessoas : pessoaService.findAllPessoa()) {
				System.out.println("Teste de Log: ");
				log.info(listAllPessoas.getNomePessoa());
			}
		
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando pessoas pelo nome: ");
			Pessoa pessoas = pessoaService.findPessoaByName("Maria");
			log.info("Dados da pessoa por nome: \n" 
			+ "Nome: " + pessoas.getNomePessoa() + " "
					+ "Id: " + pessoas.getId() + "\n");
			System.out.println("-----------------------------------------------------------------");
			
			
			//Consultas Fones
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando todas os fones: ");
			for (Fone listAllFones : foneService.findAllFone()) {
				System.out.println("Teste de Log: ");
				log.info(listAllFones.getTipo());
			}
		
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Buscando fone pelo numero: ");
			Fone fone = foneService.findFoneByNumero("123456789");
			log.info("Dados da fone por numero: \n" 
			+ "Tipo(Fone): " + fone.getTipo() + " "
					+ "Numero: " + fone.getNumero() + "\n");
			System.out.println("-----------------------------------------------------------------");
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			
			
			
		
		};

	} // fim do bean
	
	
	@Bean
	public CommandLineRunner deleteEntity(MusicaService musicaService, CategoriaService categoriaService, 
			GravacaoService gravacaoService,
			GravadoraService gravadoraService, CantorService cantorService,
			 PessoaService pessoaService, FoneService foneService) {
		return (args) -> {
			
			//Metodos para exclusão.	
			
			//cantorService.deleteCantorId(28l);
			
			//categoriaService.deleteCategoriaId(7l);
			
			//gravacaoService.deleteGravacaoId(23l);
		
			//gravadoraService.deleteGravadoraId(2l);
			
			//musicaService.deleteMusicaId(33l);
			
			//pessoaService.deletePessoaId(22l);
			
			
		
		};

	} // fim do bean

}
