package posutfpr.banco.ativcinco.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name = "Gravacao")
public class Gravacao extends AbstractPersistable<Long>{
	
	@Column(name = "dataGravacao", length = 64, nullable = false)
	private Date dataGravacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "musica_id")
	private Musica  musica;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gravadora_id")
	private Gravadora  gravadora;

	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "codCantor")
	 private Cantor cantor;
	
	
	public Gravacao(Date dataGravacao, Musica musica, Gravadora gravadora, Cantor cantor) {
		super();
		this.dataGravacao = dataGravacao;
		this.musica = musica;
		this.gravadora = gravadora;
		this.cantor = cantor;
	}

	public Gravacao(Date dataGravacao, Gravadora gravadora, Musica musica) {
		super();
		this.dataGravacao = dataGravacao;
		this.gravadora = gravadora;
		this.musica = musica;
	}

	public Gravacao(Date dataGravacao, Gravadora gravadora) {
		super();
		this.dataGravacao = dataGravacao;
		this.gravadora = gravadora;
		
	}
	
	
	public Gravacao() {
		
	}

	public Date getDataGravacao() {
		return dataGravacao;
	}

	public void setDataGravacao(Date dataGravacao) {
		this.dataGravacao = dataGravacao;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}
	
		

}
