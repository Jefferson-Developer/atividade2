package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@NamedQueries({
	@NamedQuery(name = "time.All", query = "select e from Equipe e"),
	@NamedQuery(name = "timeByNome", query = "select e from Equipe e where e.nome=:nome"),
})
public class Equipe implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	private String nome;
	
	@OneToOne(cascade =  CascadeType.ALL)
	private Tecnico tecnico;
	
	@OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
	private List<Jogador> jogadores;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "equipe_campeonato", joinColumns = { @JoinColumn(name = "equipe_id")},
	inverseJoinColumns = {@JoinColumn(name = "campeonato_id")})
	private List<Campeonato> campeonatos;
	

	public Equipe(String nome, Tecnico tecnico) {
		this.nome = nome;
		this.tecnico = tecnico;
	}
	


	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}



	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
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



	public Equipe() {
		super();
	}



	public Tecnico getTecnico() {
		return tecnico;
	}



	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}



	public List<Jogador> getJogadores() {
		return jogadores;
	}



	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}



	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nome=" + nome + ", tecnico=" + tecnico + ", jogadores=" + jogadores
				+ ", campeonatos=" + campeonatos + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
}
