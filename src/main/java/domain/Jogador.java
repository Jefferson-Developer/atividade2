package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "jogador.All", query = "select j from Jogador j"),
	@NamedQuery(name = "jogadorByNome", query = "select j from Jogador j where j.nome=:nome")
})
public class Jogador implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	private String posicao;
	private boolean isTitular;
	
	@ManyToOne
	private Equipe equipe;
	
	
	public Jogador(){
		
	}
	
	

	public Jogador(String nome, String posicao, boolean isTitular, Equipe equipe) {
		this.nome = nome;
		this.posicao = posicao;
		this.isTitular = isTitular;
		this.equipe = equipe;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public boolean isTitular() {
		return isTitular;
	}

	public void setTitular(boolean isTitular) {
		this.isTitular = isTitular;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}



	@Override
	public String toString() {
		return "Jogador [id=" + id + ", nome=" + nome + ", posicao=" + posicao + ", isTitular=" + isTitular + "]";
	}
	
	
	
	
	
	
	
}
