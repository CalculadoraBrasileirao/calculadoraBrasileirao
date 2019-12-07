package campeonato_time;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelsVO.Campeonato;
import modelsVO.CampeonatoTime;
import modelsVO.Time;

public class CampeonatoTimeDAO implements ICampeonatoTimeDAO {
private Connection conexao;
	
	public CampeonatoTimeDAO(Connection conexao){
		this.conexao = conexao;
	}

	
	
	@Override
	public void insertCampeonato_time(Campeonato campeonato) {
		
			PreparedStatement pst =null;
			if (campeonato !=null) {
				try {
					pst = conexao.prepareStatement("insert into campeonato_time(fk_cdcampeonato)"
							+ " values(?)");
					pst.setInt(1, campeonato.getCodigo());
					pst.execute();
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	public void insertTime_time(Time time) {
		PreparedStatement pst =null;
		if (time !=null) {
			try {
				pst = conexao.prepareStatement("insert into campeonato_time(fk_cdtime)"
						+ " values(?)");
				pst.setInt(1, time.getCodigo());
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<CampeonatoTime> getAllCampeonato_Time() {
		ArrayList<CampeonatoTime> CampeonatoTime = new ArrayList<CampeonatoTime>();
		CampeonatoTime resultado=null;
		PreparedStatement pst = null;
		ResultSet result = null;
		
		try {
			pst=conexao.prepareStatement("select * from campeonato_time");
			result = pst.executeQuery();
			
			while (result.next()) {
				resultado = new CampeonatoTime();
				resultado.setFkCdTime(result.getInt("fk_cdtime"));
				resultado.setFkCdCampeonato(result.getInt("fk_cdcampeonato"));
				CampeonatoTime.add(resultado);
			}
			result.close();
			pst.close();	
		} catch (SQLException e) {
			System.out.println("Falha ao encontrar codigo");
			e.printStackTrace();
		}
		return CampeonatoTime;
	}

	

}
