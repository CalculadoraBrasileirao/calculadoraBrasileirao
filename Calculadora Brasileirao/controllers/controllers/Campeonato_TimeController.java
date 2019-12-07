package controllers;

import java.util.ArrayList;

import campeonato_time.CampeonatoTimeDAO;
import modelsVO.CampeonatoTime;
import modelsVO.Time;
import postgres.BancoFactoryDAO;

public class Campeonato_TimeController {

	public CampeonatoTimeDAO iniciaConexao() {
		BancoFactoryDAO banco= new BancoFactoryDAO();
		CampeonatoTimeDAO campeonatoTimeDAO = banco.getCampeonatoTime();
		return campeonatoTimeDAO;
	}

	public ArrayList<Time> timesNoCampeonato(){
		 ArrayList<Time> timesCompeticao = new ArrayList<Time>();
		ArrayList<CampeonatoTime> campeonatoTime = new ArrayList<CampeonatoTime>();
		campeonatoTime=new Campeonato_TimeController().iniciaConexao().getAllCampeonato_Time();
		ArrayList<Time> time = new ArrayList<Time>();
		time=new TimeController().iniciaConexao().getAllTime();
		for (CampeonatoTime time0 : campeonatoTime) {
			for (Time time1 : time) {
				if (time1.getCodigo()==time0.getFkCdTime()) {
					timesCompeticao.add(time1);
				}
			}
		}
	return 	timesCompeticao;
	}
	
}
