package controllers;

import campeonato.CampeonatoDAO;
import postgres.BancoFactoryDAO;


public class CampeonatoController {
	
	public CampeonatoDAO iniciaConexao() {
		BancoFactoryDAO banco= new BancoFactoryDAO();
		CampeonatoDAO campeonatoDAO = banco.getCampeonato();
		return campeonatoDAO;
	}
	
	
}
