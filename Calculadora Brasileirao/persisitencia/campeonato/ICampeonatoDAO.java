package campeonato;

import java.util.ArrayList;

import modelsVO.Campeonato;

public interface ICampeonatoDAO {
	public void updateCampeonato(Campeonato campeonato);
	public Campeonato getCampeonato(int codigo); 
	public void deleteCampeonato(int codigo);
	public void insertCampeonato(Campeonato campeonato);
	public ArrayList<Campeonato> getAllCampeonato();
}
