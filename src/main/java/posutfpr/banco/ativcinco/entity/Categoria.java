package posutfpr.banco.ativcinco.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "Categoria")
public class Categoria extends AbstractPersistable<Long> {
	
	
		
	

	public Categoria(String descCategoria) {
		super();
		this.descCategoria = descCategoria;
		}


	@Column(name = "descCategori", length = 64, nullable = false)
	private String descCategoria;
	
	
	@OneToMany(mappedBy = "categoria",
    orphanRemoval = true,
    fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
	private List<Musica> musicas = new ArrayList<>();
	
	
	

	public String getDescCategoria() {
		return descCategoria;
	}


	public void setDescCategoria(String descCategoria) {
		this.descCategoria = descCategoria;
	}


	public List<Musica> getMusicas() {
		return musicas;
	}


	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	
	
}

