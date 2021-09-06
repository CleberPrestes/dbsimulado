package posutfpr.banco.ativcinco.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name = "Gravacao")
public class Gravacao extends AbstractPersistable<Long>{
	
	@Column(name = "dataGravacao", length = 64, nullable = false)
	private Date dataGravacao;
	
	
	 /*
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
	private Gravadora  gravadora;

	private List<Cantor>  cantor = new ArrayList<>();
	*/
	
	@OneToOne(mappedBy = "gravacao")
	private Musica  musica;
	
				

	public Gravacao(Date dataGravacao) {
		super();
		this.dataGravacao = dataGravacao;
	
		
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
