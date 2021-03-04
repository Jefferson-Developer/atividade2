package domain;

import java.util.List;

import javax.persistence.Query;



public class JogadorDao extends GenericDao<Equipe>{
	
	public List<Equipe> equipesGetAll(){
		
		return em.createNamedQuery("jogador.All").getResultList();
		
	}
	
	public Jogador getJogadorByName(String nome) {
		Query query = em.createNamedQuery("jogadorByNome");
		query.setParameter("nome", nome);
		return (Jogador)query.getSingleResult();
	}
	
}
