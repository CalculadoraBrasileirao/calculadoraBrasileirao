package controllers;

import campeonato.CampeonatoDAO;
import modelsVO.Resultado;
import postgres.BancoFactoryDAO;
import resultado.ResultadoDAO;

public class ResultadoController {
	private ResultadoDAO resultadoDAO;
	
	private ResultadoDAO getResultadoConexaoBanco() {
		BancoFactoryDAO bd = new BancoFactoryDAO();
		resultadoDAO = bd.getResultado();		
		return resultadoDAO;
	}
	
	public Resultado getResultado(int codigo) {
		Resultado resultado = new Resultado();
		resultadoDAO = getResultadoConexaoBanco();
		resultado = resultadoDAO.getResultado(codigo);
		return resultado;
	}

	public void deleteResultado(int codigo) {
		resultadoDAO = getResultadoConexaoBanco();
		resultadoDAO.deleteResultado(codigo);
	}

	public void updateResultado(Resultado resultado) {
		resultadoDAO = getResultadoConexaoBanco();
		resultadoDAO.updateResultado(resultado);
	}
	
	public void insertResultado(Resultado resultado) {
		resultadoDAO = getResultadoConexaoBanco();
		resultadoDAO.insertResultado(resultado);
	}
	
	public CampeonatoDAO iniciaConexao() {
		BancoFactoryDAO banco= new BancoFactoryDAO();
		CampeonatoDAO campeonatoDAO = banco.getCampeonato();
		return campeonatoDAO;
	}
	

}
