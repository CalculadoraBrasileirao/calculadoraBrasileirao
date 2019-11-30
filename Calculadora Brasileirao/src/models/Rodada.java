package models;

import java.util.Date;

public class Rodada {
	private int codigo;
	private int numeroRodada;
	private Date data;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getNumeroRodada() {
		return numeroRodada;
	}
	public void setNumeroRodada(int numeroRodada) {
		this.numeroRodada = numeroRodada;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	

}
