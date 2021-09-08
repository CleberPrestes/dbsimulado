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
@Table(name = "Pessoa")
public class Pessoa extends AbstractPersistable<Long> {

	

	public Pessoa(String nomePessoa) {
		super();
		this.nomePessoa = nomePessoa;
	}


	public Pessoa() {
		
	}



	@Column(name = "nomePessoa", length = 64, nullable = false)
	private String nomePessoa;
	
	
	@OneToMany(mappedBy = "pessoa",
    orphanRemoval = true,
    fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
	private List<Fone> fones = new ArrayList<>();


	public String getNomePessoa() {
		return nomePessoa;
	}


	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}


	public List<Fone> getFones() {
		return fones;
	}


	public void setFones(List<Fone> fones) {
		this.fones = fones;
	}
	

	
}

