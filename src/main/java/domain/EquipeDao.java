package domain;

import java.util.List;

public class EquipeDao extends GenericDao<Equipe>{
	
	public List<Equipe> equipesGetAll(){
		
		return em.createNamedQuery("time.All").getResultList();
		
	}

}
