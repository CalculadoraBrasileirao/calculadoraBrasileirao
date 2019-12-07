package modelsBO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import modelsVO.Partida;
import modelsVO.Time;

public class PartidasBO {
	private Date data;
	
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
	
	public ArrayList<Partida> createPartidas(ArrayList<Time> listTimes) {
        ArrayList<Partida> partidas = new ArrayList<Partida>();

        int nrRodadas = 38;
        ArrayList<Time> listTimes = new ArrayList<Time>(tournament.getTournamentTeams());

        int totTimes = listTimes.size();

        for(int k = 1; k<=nrRodadas; k++)
        {

            for(int i = 0; i < totTimes-1; i++)
            {

                for(int j = i+1; j < totTimes; j++)
                {
                    Partida partida = new Partida();
                    partida.setTimeMandante(listTimes.getCodigo(i)
                    partida.setTimeVisitante(listTimes.getCodigo(j));
                    partidas.add(partida);
                }
            }
        }
        return partidas;
    }
	
	
	
	public Date setData(String dia,String mes) {
		String date = dia+"/"+mes+"/"+"2019";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.data = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return this.data;
	}
	
	public  List<Date> geraDatas(Date dataInicio, Date dataFim,
	        int... diasParaVerificar) {
	    Calendar calEnd = Calendar.getInstance();
	    calEnd.setTime(dataFim);
	    Calendar actualDay = Calendar.getInstance();
	    actualDay.setTime(dataInicio);
	    List<Date> weekDays = new ArrayList<>();
	    while (actualDay.before(calEnd)) {
	        for (int weekDay : diasParaVerificar) {
	            if (actualDay.get(Calendar.DAY_OF_WEEK) == weekDay) {
	                weekDays.add(actualDay.getTime());
	                break;
	            }
	        }
	        actualDay.add(Calendar.DAY_OF_MONTH, 1);
	    }
	    return weekDays;
	}

	

	
	
}
