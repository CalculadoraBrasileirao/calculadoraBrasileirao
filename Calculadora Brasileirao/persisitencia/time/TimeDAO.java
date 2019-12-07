package time;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelsVO.Campeonato;
import modelsVO.Time;

public class TimeDAO implements ITimeDAO{
private Connection conexao;
	
	public TimeDAO(Connection conexao){
		this.conexao = conexao;
		
	}

	@Override
	public void updateTime(Time time) {
		PreparedStatement pst = null;
		if(time!=null) {
			try {
				pst= conexao.prepareStatement("update time set nmtime = ?");
				pst.setString(1, time.getNome());
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

	@Override
	public Time getTime(int codigo) {
		Time resultado=null;
		PreparedStatement pst = null;
		ResultSet result = null;
		
		try {
			pst=conexao.prepareStatement("select * from time where cdtime= ?");
			pst.setInt(1, codigo);
			result = pst.executeQuery();
			
			if (result.next()) {
				resultado= new Time();
				resultado.setNome(result.getString("nmtime"));
				resultado.setCodigo(result.getInt("cdtime"));
			}
			result.close();
			pst.close();	
		} catch (SQLException e) {
			System.out.println("Falha ao encontrar codigo");
			e.printStackTrace();
		}
		return resultado;
	}

	
	@Override
	public void deleteTime(int codigo) {
		// TODO Auto-generated method stub
		PreparedStatement pst = null;
		if (codigo>=0) {
			try {
				pst=conexao.prepareStatement("delete from time where cdtime = ?");
				pst.setInt(1, codigo);
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<Time> getAllTime() {
		ArrayList<Time> times = new ArrayList<Time>();
		Time resultado=null;
		PreparedStatement pst = null;
		ResultSet result = null;
		
		try {
			pst=conexao.prepareStatement("select * from time");
			result = pst.executeQuery();
			
			while (result.next()) {
				resultado = new Time();
				resultado.setCodigo(result.getInt("cdtime"));
				resultado.setNome(result.getString("nmtime"));
				times.add(resultado);
			}
			result.close();
			pst.close();	
		} catch (SQLException e) {
			System.out.println("Falha ao encontrar codigo");
			e.printStackTrace();
		}
		return times;
	}


	@Override
	public void insertTime(Time resultado) {
		PreparedStatement pst =null;
		if (resultado !=null) {
			try {
				pst = conexao.prepareStatement("insert into time(nmtime)"
						+ " values(?)");
				pst.setString(1, resultado.getNome());
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
