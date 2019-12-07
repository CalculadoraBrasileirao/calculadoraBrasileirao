package cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import controllers.CampeonatoController;
import controllers.Campeonato_TimeController;
import controllers.RodadasController;
import controllers.TimeController;
import modelsBO.PartidasBO;
import modelsVO.Campeonato;
import modelsVO.CampeonatoTime;
import modelsVO.Partida;
import modelsVO.Time;
import time.TimeDAO;

public class MenuPrincipalCLI {
   private Scanner ler = new Scanner(System.in);
	public void inicia() {
		System.out.println("	Menu\n");		
		System.out.println("Digite 1: Para ir ao Menu");
		System.out.println("Digite 0: Para sair");
		int opcao = ler.nextInt();
		
		
		switch(opcao) {
			case 1:
				cadastros();
				break;
			case 0:
				System.out.println("Aplicação encerrada");
				break;
				
			default:
				System.out.println("Digite uma opcao valida\n");
				inicia();
				break;
			}
		}

	
	private void cadastros() {
		System.out.println("\n	Menu \n");
		System.out.println("Digite 1: Cadastro de campeonato");
		System.out.println("Digite 2: Cadastro de times");
		System.out.println("Digite 3: Cadastro de Resultados");
		System.out.println("Digite 4: Definir data de inicio do torneio");
		System.out.println("Digite 0: Para Sair\n");
		int opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Funcionalidade não disponivel no BETA :)\n");
			cadastros();
			break;
		
		case 2: // MENU CADASTRO DE TIMES
			System.out.println("Funcionalidade não disponivel no BETA :)\n");
			cadastros();
			break;
			
		case 3:
			ArrayList<Partida> partidas;
			ArrayList<Time> timesNoCampeonato=new Campeonato_TimeController().timesNoCampeonato();
			partidas=new PartidasBO().geraPartidas(timesNoCampeonato);

			break;
			
		case 4:
			System.out.println("Digite o dia de inicio");
			ler.nextLine();
			String dia=ler.nextLine();
			System.out.println("Digite o mês");
			String mes=ler.nextLine();
			Date data= new PartidasBO().setData(dia,mes);
			Calendar calEnd = Calendar.getInstance();
			calEnd.set(2020, 0, 1, 0, 0, 0); // 01/01/2020 as 00h00
			System.out.println("data "+data);
			List<Date> datas=new PartidasBO().geraDatas(data,calEnd.getTime(), Calendar.TUESDAY,Calendar.SUNDAY);
			System.out.println(Arrays.toString(datas.toArray()));
			break;
		
		case 0:
			inicia();
			break;
			
		default:
			System.out.println("Digite uma opcao valida\n");
			cadastros();
			break;
		}
	}
		
	private void selecionaCampeonato() {
		System.out.println("Selecione o campeonato\n");   
	
	}

	
	
}
