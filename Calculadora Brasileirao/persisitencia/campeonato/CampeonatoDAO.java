package campeonato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelsVO.Campeonato;

public class CampeonatoDAO implements ICampeonatoDAO {
private Connection conexao;
	
	public CampeonatoDAO(Connection conexao){
		this.conexao = conexao;
	}

	@Override
	public void updateCampeonato(Campeonato resultado) {
		PreparedStatement pst = null;
		if(resultado!=null) {
			try {
				pst= conexao.prepareStatement("update campeonato set nmcampeonato = ?,nmtime_campeao = ?");
				pst.setString(1, resultado.getNome());
				pst.setString(2, resultado.getTimeCampeao() );
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}


	@Override
	public Campeonato getCampeonato(int codigo) {
		Campeonato resultado=null;
		PreparedStatement pst = null;
		ResultSet result = null;
		
		try {
			pst=conexao.prepareStatement("select * from campeonato where cdcampeonato = ?");
			pst.setInt(1, codigo);
			result = pst.executeQuery();
			
			if (result.next()) {
				resultado= new Campeonato();
				resultado.setCodigo(result.getInt("cdcampeonato"));
				resultado.setNome(result.getString("nmcampeonato"));
				resultado.setTimeCampeao(result.getString("nmtime_campeao"));
			}
			result.close();
			pst.close();	
		} catch (SQLException e) {
			System.out.println("Falha ao encontrar codigo");
			e.printStackTrace();
		}
		return resultado;
	}

	
	public ArrayList<Campeonato> getAllCampeonato() {
		ArrayList<Campeonato> campeonato = new ArrayList<Campeonato>();
		Campeonato resultado=null;
		PreparedStatement pst = null;
		ResultSet result = null;
		
		try {
			pst=conexao.prepareStatement("select * from campeonato");
			result = pst.executeQuery();
			
			while (result.next()) {
				resultado = new Campeonato();
				resultado.setCodigo(result.getInt("cdcampeonato"));
				resultado.setNome(result.getString("nmcampeonato"));
				resultado.setTimeCampeao(result.getString("nmtime_campeao"));
				campeonato.add(resultado);
			}
			result.close();
			pst.close();	
		} catch (SQLException e) {
			System.out.println("Falha ao encontrar codigo");
			e.printStackTrace();
		}
		return campeonato;
	}

	@Override
	public void deleteCampeonato(int codigo) {
		// TODO Auto-generated method stub
		PreparedStatement pst = null;
		if (codigo>=0) {
			try {
				pst=conexao.prepareStatement("delete from campeonato where cdcampeonato = ?");
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
	public void insertCampeonato(Campeonato resultado) {
		PreparedStatement pst =null;
		if (resultado !=null) {
			try {
				pst = conexao.prepareStatement("insert into campeonato(nmcampeonato,nmtime_campeao)"
						+ " values(?,?)");
				pst.setString(1, resultado.getNome());
				pst.setString(2, resultado.getTimeCampeao());
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
