package postgres;

import java.util.ArrayList;

import models.Resultado;

public interface IResultadoDAO {
	public void atualizaResultado(Resultado resultado);
	public Resultado getResultado(int codigo); 
	public ArrayList<Resultado> getAllResultado();
	public void deleteAllResultado();
	public void deleteResultado(int codigo);
	public void setResultado(Resultado resultado);
	public void setAllResultado(ArrayList<Resultado> resultado);

}
