package campeonato_time;

import java.util.ArrayList;

import modelsVO.Campeonato;
import modelsVO.CampeonatoTime;
import modelsVO.Time;


public interface ICampeonatoTimeDAO {
	public void insertCampeonato_time(Campeonato campeonato);
	public void insertTime_time(Time time);
	public ArrayList<CampeonatoTime> getAllCampeonato_Time();	
}
