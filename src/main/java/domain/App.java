package domain;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
	
		/*
		 * Pessoa jose = new Pessoa("José", "111", 3); Pessoa maria = new
		 * Pessoa("Maria", "222", 30); Pessoa jefferson = new Pessoa("Jefferson",
		 * "2222", 27);
		 */
//		PessoaFisica pf = new PessoaFisica();
		
		Tecnico tecnico = new Tecnico("Jefferson");
		Equipe equipe = new Equipe("Sousa", tecnico);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exemplo_PU");
		
		equipe.setJogadores(Arrays.asList(new Jogador("Yuri", "Goleiro", false, equipe), new Jogador("Erlon", "Meia", false, equipe)));
		
		equipe.setCampeonatos(Arrays.asList(new Campeonato("Paulista"), new Campeonato("Brasileirão")));
		
		EntityManager em = emf.createEntityManager();
		
//		Concessionaria concessionaria = new Concessionaria("Sell Cars", "8399941444");
//		Endereco endereco = new Endereco("Rua azul", "83", "Centro", "Sousa", "PB", concessionaria);
		//Acessorio acessorio = new Acessorio(veiculo, true, true, true);
		
//		concessionaria.setVeiculos(Arrays.asList(new Veiculo("Ford", "KA", 1999, null, concessionaria)));
		
		
				
		
		
		em.getTransaction().begin();
		// add no bd
		//em.persist(equipe);
		//em.persist(maria);
		
		// Atualizar o bd	
//		Pessoa updateMaria = em.find(Pessoa.class, 2l);
//		updateMaria.setCpf("332");
//		em.merge(updateMaria);
		/////////////////////////////////////
		
		//adicionar ao db
		em.persist(equipe);
		
		// apagar
//		Equipe m = em.find(Equipe.class, 2l);
//		System.out.println("FSDFSDFSD" + em.contains("Sousa"));
		
		
		
//		BuscaDao buscaJogador = new BuscaDao<Jogador>();
//		System.out.println(buscaJogador.findByName(Jogador.class, "Yuri"));
		
		
		em.getTransaction().commit();
		em.close();
		
		
	}

}
