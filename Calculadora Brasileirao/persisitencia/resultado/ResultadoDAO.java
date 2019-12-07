package resultado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelsVO.Resultado;

public class ResultadoDAO implements IResultadoDAO{
	private Connection conexao;
	
	public ResultadoDAO(Connection conexao){
		this.conexao = conexao;
	}

	@Override
	public void updateResultado(Resultado resultado) {
		PreparedStatement pst = null;
		if(resultado!=null) {
			try {
				pst= conexao.prepareStatement("update resultado set nrpontos = ?,nrgols = ?,"
						+ "nrvitorias= ?,nrempates = ?,nrderrotas = ? where cdresultado = ? ");
				pst.setInt(1, resultado.getPontos());
				pst.setInt(2, resultado.getGols());
				pst.setInt(3, resultado.getVitorias());
				pst.setInt(4, resultado.getEmpates());
				pst.setInt(5, resultado.getDerrotas());
				pst.setInt(6, resultado.getCodigo());
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}


	@Override
	public Resultado getResultado(int codigo) {
		Resultado resultado=null;
		PreparedStatement pst = null;
		ResultSet result = null;
		
		try {
			pst=conexao.prepareStatement("select * from resultado where cdresultado= ?");
			pst.setInt(1, codigo);
			result = pst.executeQuery();
			
			if (result.next()) {
				resultado= new Resultado();
				resultado.setCodigo(result.getInt("cdresultado"));
				resultado.setPontos(result.getInt("nrpontos"));
				resultado.setGols(result.getInt("nrgols"));
				resultado.setVitorias(result.getInt("nrvitorias"));
				resultado.setEmpates(result.getInt("nrempates"));
				resultado.setDerrotas(result.getInt("nrderrotas"));	
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
	public void deleteResultado(int codigo) {
		// TODO Auto-generated method stub
		PreparedStatement pst = null;
		if (codigo>=0) {
			try {
				pst=conexao.prepareStatement("delete from resultado where cdresultado = ?");
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
	public void insertResultado(Resultado resultado) {
		PreparedStatement pst =null;
		if (resultado !=null) {
			try {
				pst = conexao.prepareStatement("insert into resultado(nrpontos,nrgols,nrvitorias,nrempates,nrderrotas)"
						+ " values(?,?,?,?,?)");
				pst.setInt(1, resultado.getPontos());
				pst.setInt(2, resultado.getGols());
				pst.setInt(3, resultado.getVitorias());
				pst.setInt(4, resultado.getEmpates());
				pst.setInt(5, resultado.getDerrotas());
				pst.execute();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}



	
}
