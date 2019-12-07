package postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import campeonato.CampeonatoDAO;
import campeonato_time.CampeonatoTimeDAO;
import partida.PartidaDAO;
import resultado.ResultadoDAO;
import time.TimeDAO;

public class BancoFactoryDAO extends FactoryDAO {

	private Connection conexao;
	
	 public BancoFactoryDAO(){
		this.conexao = getConnection("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/CalculadoraBrasileirao" 
		,"postgres","postgres");
	}
	

	public Connection getConnection(String driver, String conexao, String usuario, String senha) {
		
		Connection con=null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(conexao, usuario, senha);
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao encontrar driver");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar");
		}
		
		return con;
	}

	@Override
	public ResultadoDAO getResultado() {
		return new ResultadoDAO(this.conexao);
	}
	
	@Override
	public TimeDAO getTime() {
		return new TimeDAO(this.conexao);
	}


	@Override
	public CampeonatoDAO getCampeonato() {
		return new CampeonatoDAO(this.conexao);
	}
	
	public CampeonatoTimeDAO getCampeonatoTime() {
		return new CampeonatoTimeDAO(this.conexao);
	}
	
	public PartidaDAO getPartida() {
		return new PartidaDAO(this.conexao);
	}


	@Override
	public void fechaConexao() {
		try {
			this.conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
