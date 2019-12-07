package cli;

import java.util.Scanner;

import gui.MenuGrafico;

public class MenuCLI {
	private Scanner ler = new Scanner(System.in);
  	
	public void inicia() { // METODO QUE INICIA A ESCOLHA DE INTERFACE PARA O USUARIO
		System.out.println("  Menu Principal  \n");
		System.out.println("Escolha uma opção de inteface: \n");
		System.out.println("Digite 1: para CLI");
		System.out.println("Digite 2: para Interface gráfica");
		System.out.println("Digite 0: para sair \n");
		int opcao=ler.nextInt();
		
			switch(opcao) {
			case 1:
				new MenuPrincipalCLI().inicia();
				break;	
			case 2:
				System.out.println("Iniciando nova interface...");
				new MenuGrafico().inicia();
				
				break;
			case 0:
				System.out.println("Fechando aplicação...");
				break;	
			}
	}
}
