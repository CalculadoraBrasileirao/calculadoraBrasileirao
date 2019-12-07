package models;

public class Partida {
	private int codigo;
	private String timeVisitante;
	private String timeMandante;
	private int golsVisitante;
	private int golsMandante;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public String getTimeMandante() {
		return timeMandante;
	}
	public void setTimeMandante(String timeMandante) {
		this.timeMandante = timeMandante;
	}
	public int getGolsVisitante() {
		return golsVisitante;
	}
	public void setGolsVisitante(int golsVisitante) {
		this.golsVisitante = golsVisitante;
	}
	public int getGolsMandante() {
		return golsMandante;
	}
	public void setGolsMandante(int golsMandante) {
		this.golsMandante = golsMandante;
	}
	

}
