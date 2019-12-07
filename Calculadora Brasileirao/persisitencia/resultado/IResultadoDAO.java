package resultado;
import modelsVO.Resultado;

public interface IResultadoDAO {
	public void updateResultado(Resultado resultado);
	public Resultado getResultado(int codigo); 
	public void deleteResultado(int codigo);
	public void insertResultado(Resultado resultado);
}
