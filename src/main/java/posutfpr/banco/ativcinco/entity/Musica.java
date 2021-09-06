package posutfpr.banco.ativcinco.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name = "Musica")
public class Musica extends AbstractPersistable<Long>{
	


	
	
	
	

	public Musica(Long duracao, String titulo, Categoria categoria, Gravacao gravacao) {
		super();
		this.duracao = duracao;
		this.titulo = titulo;
		this.categoria = categoria;
		this.gravacao = gravacao;
	}

	@Column(name = "duracao", length = 64, nullable = false)
	private Long duracao;
	
	@Column(name = "titulo", length = 64, nullable = false)
	private String titulo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gravacao", referencedColumnName = "id")
	private Gravacao gravacao;

	
	
	public Gravacao getGravacao() {
		return gravacao;
	}

	public void setGravacao(Gravacao gravacao) {
		this.gravacao = gravacao;
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
	
	//@OneToOne	
	//private Gravacao gravacao;
	
		
	

}
