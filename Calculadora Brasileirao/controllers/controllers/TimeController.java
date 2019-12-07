package controllers;

import postgres.BancoFactoryDAO;
import time.TimeDAO;

public class TimeController {
	
	
	public TimeDAO iniciaConexao() {
		BancoFactoryDAO banco= new BancoFactoryDAO();
		TimeDAO timeDAO = banco.getTime();
		return timeDAO;
	}
}
