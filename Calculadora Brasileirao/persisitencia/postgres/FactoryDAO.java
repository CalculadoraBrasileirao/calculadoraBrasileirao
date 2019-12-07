package postgres;

import campeonato.CampeonatoDAO;
import campeonato_time.CampeonatoTimeDAO;
import partida.PartidaDAO;
import resultado.ResultadoDAO;
import time.TimeDAO;

public abstract class FactoryDAO {
	public abstract ResultadoDAO getResultado();
	public abstract TimeDAO getTime();
	public abstract CampeonatoDAO getCampeonato();
	public abstract CampeonatoTimeDAO getCampeonatoTime();
	public abstract PartidaDAO getPartida();
	public abstract void fechaConexao();
	
}
