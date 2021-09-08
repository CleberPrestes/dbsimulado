package posutfpr.banco.ativcinco.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name = "Musica")
public class Musica extends AbstractPersistable<Long>{
	
	

	public Musica(Long duracao, String titulo, Categoria categoria) {
		super();
		this.duracao = duracao;
		this.titulo = titulo;
		this.categoria = categoria;
	
	}
	
	
	public Musica(Long duracao, String titulo) {
		super();
		this.duracao = duracao;
		this.titulo = titulo;
		
	
	}
	
	

	public Musica() {
		super();
	}



	@Column(name = "duracao", length = 64, nullable = false)
	private Long duracao;
	
	@Column(name = "titulo", length = 64, nullable = false)
	private String titulo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	
	@OneToMany(mappedBy = "musica",
	orphanRemoval = true,
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	private List<Gravacao> gravacoes = new ArrayList<>();
	
	
	


	public List<Gravacao> getGravacoes() {
		return gravacoes;
	}

	public void setGravacoes(List<Gravacao> gravacoes) {
		this.gravacoes = gravacoes;
	}

	public Long getDuracao() {
		return duracao;
	}

	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
