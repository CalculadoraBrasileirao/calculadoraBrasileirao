package modelsBO;

import java.util.ArrayList;

import modelsVO.Partida;
import modelsVO.Time;

public class PartidasBO {
	
	
	public ArrayList<Partida> geraPartidas(ArrayList<Time> times){
        ArrayList<Partida> listPartida = new ArrayList<Partida>();

        for(Time time1: times) {
            for(Time time2: times) {
                if(time1.getCodigo() == time2.getCodigo()) {
                    break;
                }

                Partida partida = new Partida();
                partida.setTimeMandante(time1.getCodigo());
                partida.setTimeVisitante(time2.getCodigo());
                if(!listPartida.contains(partida)) {
                    listPartida.add(partida);
                }
                listPartida.add(partida);
            }
        }

        return listPartida;
    }
	
	
}
