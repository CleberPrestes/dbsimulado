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
@Table(name = "Fone")
public class Fone extends AbstractPersistable<Long>{
	

	


	@Column(name = "numero", length = 64, nullable = false)
	private String numero;
	
	@Column(name = "tipo", length = 64, nullable = false)
	private String tipo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	
	
	
	public Fone(String numero, String tipo, Pessoa pessoa) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.pessoa = pessoa;
	}


	public Fone() {
		super();
	}
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
