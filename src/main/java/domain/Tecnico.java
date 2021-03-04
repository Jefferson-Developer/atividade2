package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tecnico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@OneToOne(mappedBy = "tecnico")
	private Equipe equipe;

	public Tecnico() {
		
	}
	
	


	public Tecnico(String nome) {
		this.nome = nome;
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







	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", nome=" + nome + ", equipe=" + equipe + "]";
	}
	
	
	
	
}
