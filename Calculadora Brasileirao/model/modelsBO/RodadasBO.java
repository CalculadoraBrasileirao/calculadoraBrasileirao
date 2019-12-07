package modelsBO;

import java.util.ArrayList;

import modelsVO.Partida;
import modelsVO.Rodada;
import modelsVO.Time;

public class RodadasBO {

	public ArrayList<Rodada> geraRodadas(ArrayList<Partida> partidas, ArrayList<Time> times){
        ArrayList<Rodada> listRodada = new ArrayList<Rodada>();

        ArrayList<Time> timesRodada = new ArrayList<Time>();

        for(int i=0; i<38; i++) {
            while(timesRodada.size() < 10) {

            }
            for(Partida partida: partidas) {
               // listRodada.add(partida);
            }
        }

        return listRodada;
    }
	
}
