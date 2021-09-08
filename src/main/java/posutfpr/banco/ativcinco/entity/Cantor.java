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
@Table(name = "Cantor")
public class Cantor extends AbstractPersistable<Long>{
	
	
	@Column(name = "nomeCantor", length = 64, nullable = false)
	private String nomeCantor;
	
	@Column(name = "pais", length = 64, nullable = false)
	private String pais;
	
	@OneToMany(mappedBy = "cantor",
	orphanRemoval = true,
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	private List<Gravacao> gravacoes = new ArrayList<>();

	public Cantor(String nomeCantor, String pais) {
		super();
		this.nomeCantor = nomeCantor;
		this.pais = pais;
		
	}
	
	

	public Cantor() {
				
	}



	public String getNomeCantor() {
		return nomeCantor;
	}

	public void setNomeCantor(String nomeCantor) {
		this.nomeCantor = nomeCantor;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Gravacao> getGravacoes() {
		return gravacoes;
	}

	public void setGravacoes(List<Gravacao> gravacoes) {
		this.gravacoes = gravacoes;
	}
	
	
	

}
