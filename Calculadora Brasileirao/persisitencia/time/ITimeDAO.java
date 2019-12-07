package time;

import modelsVO.Time;

public interface ITimeDAO {
	public void updateTime(Time resultado);
	public Time getTime(int codigo); 
	public void deleteTime(int codigo);
	public void insertTime(Time resultado);
}
