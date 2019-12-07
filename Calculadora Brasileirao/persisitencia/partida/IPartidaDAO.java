package partida;

import java.util.ArrayList;

import modelsVO.Partida;

public interface IPartidaDAO {
	public void updatePartida(Partida campeonato);
	public Partida getPartida(int codigo); 
	public void deletePartida(int codigo);
	public void insertPartida(Partida campeonato);
	public ArrayList<Partida> getAllPartida();
	
	
}
