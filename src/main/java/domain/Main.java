package domain;

public class Main {

	public static void main(String[] args) {
		
		JogadorDao equipeDao = new JogadorDao();
		System.out.println(equipeDao.equipesGetAll());
//		JogadorDao jogadorDao = new JogadorDao();
//		Jogador jogador = jogadorDao.getJogadorByName("Yuri");
//		System.out.println(jogador.getNome());
		//CampeonatoDao campeonatoDao = new CampeonatoDao();
		
	}

}
