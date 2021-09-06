package posutfpr.banco.ativcinco.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "Gravadora")
public class Gravadora extends AbstractPersistable<Long>{
	
	@Column(name = "nomeGravadora", length = 64, nullable = false)
	private String nomeGravadora;
	
	@Column(name = "pais", length = 64, nullable = false)
	private String pais;
	
		
	@OneToMany(mappedBy = "gravadora",
		    orphanRemoval = true,
		    fetch = FetchType.LAZY,
		    cascade = CascadeType.ALL)
	private List<Gravacao>  gravacao = new ArrayList<>();



	public Gravadora(String nomeGravadora, String pais
) {
		super();
		this.nomeGravadora = nomeGravadora;
		this.pais = pais;
		
	}



	public String getNomeGravadora() {
		return nomeGravadora;
	}



	public void setNomeGravadora(String nomeGravadora) {
		this.nomeGravadora = nomeGravadora;
	}



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public List<Gravacao> getGravacao() {
		return gravacao;
	}



	public void setGravacao(List<Gravacao> gravacao) {
		this.gravacao = gravacao;
	}
	
	
	
	

}
