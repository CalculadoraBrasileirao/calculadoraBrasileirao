package partida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelsVO.Partida;

public class PartidaDAO implements IPartidaDAO {
	private Connection conexao;
	
	public PartidaDAO(Connection conexao){
		this.conexao = conexao;
	}
	
	@Override
	public void updatePartida(Partida resultado) {
		PreparedStatement pst = null;
		if(resultado!=null) {
			try {
				pst= conexao.prepareStatement("update partida"
						+ " set nrgols_visitante = ?,nrgols_mandante = ?");
				pst.setInt(1, resultado.getGolsVisitante());
				pst.setInt(2, resultado.getGolsMandante());
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

	@Override
	public Partida getPartida(int codigo) {
		Partida resultado=null;
		PreparedStatement pst = null;
		ResultSet result = null;
		
		try {
			pst=conexao.prepareStatement("select * from partida where cdpartida = ?");
			pst.setInt(1, codigo);
			result = pst.executeQuery();
			
			if (result.next()) {
				resultado= new Partida();
				resultado.setCodigo(result.getInt("cdpartida"));
				resultado.setGolsMandante(result.getInt("nrgols_mandante"));
				resultado.setGolsVisitante(result.getInt("nrgols_visitante"));
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
	public void deletePartida(int codigo) {
		// TODO Auto-generated method stub
		PreparedStatement pst = null;
		if (codigo>=0) {
			try {
				pst=conexao.prepareStatement("delete from partida where cdpartida = ?");
				pst.setInt(1, codigo);
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void insertPartida(Partida resultado) {
		PreparedStatement pst =null;
		if (resultado !=null) {
			try {
				pst = conexao.prepareStatement("insert into partida(nrgols_visitante,"
						+ "nrgols_mandante)"
						+ " values(?,?)");
				pst.setInt(1, resultado.getGolsVisitante());
				pst.setInt(2, resultado.getGolsMandante());
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

	@Override
	public ArrayList<Partida> getAllPartida() {
		// TODO Auto-generated method stub
		return null;
	}

}
