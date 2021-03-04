package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Campeonato implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "campeonatos", cascade = CascadeType.ALL)
	private List<Equipe> equipes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	public Campeonato(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Campeonato [id=" + id + ", nome=" + nome + ", equipes=" + equipes + "]";
	}
	
	
	
	
	
}
