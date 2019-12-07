package bin;

import java.util.Scanner;

import cli.MenuPrincipalCLI;
import gui.Menu;
import postgres.BancoFactoryDAO;
import postgres.ResultadoDAO;

public class Main {

	public static void main(String[] args) {

		System.out.println("a");
		Scanner b = new Scanner(System.in);

		int a = b.nextInt();

		if (a == 1) {
			new Menu().inicia();

		} else {
			new MenuPrincipalCLI().inicia();
		}
		BancoFactoryDAO bd = new BancoFactoryDAO();
		
		
		ResultadoDAO resultado = new ResultadoDAO(bd.getConexao());
		resultado.getResultado(1);
	}
}
