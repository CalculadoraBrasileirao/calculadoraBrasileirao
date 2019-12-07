package postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoFactoryDAO extends FactoryDAO {

	private Connection conexao;
	
	 public BancoFactoryDAO(){
		this.conexao = getConnection("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/CalculadoraBrasileirao" 
		,"postgres","postgress");
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

	public Connection getConexao() {
		return this.conexao;
	}


	@Override
	public ResultadoDAO getResultado() {
		
		return new ResultadoDAO(conexao);
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
