package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RodadasController {
	public Date data;
	
	
	public void setData(String data) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.data = sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	 
	
	
}
