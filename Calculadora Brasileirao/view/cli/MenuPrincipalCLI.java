package cli;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.CampeonatoController;
import controllers.Campeonato_TimeController;
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
		System.out.println("Digite 1: Para consultar");
		System.out.println("Digite 2: Para cadastrar");
		System.out.println("Digite 0: Para sair");
		int opcao = ler.nextInt();
		
		
		switch(opcao) {
			case 1:
				consultas();
				break;
			case 2:
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

	private void consultas() {
		System.out.println('\n');
		System.out.println("	Consultas\n");
		System.out.println("Digite 1: Para consultar campeonato");
		System.out.println("Digite 2: Para consultar classificacao");
		System.out.println("Digite 3: Para consultar resultados");
		System.out.println("Digite 0: Para sair\n");
		int opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			ArrayList<Campeonato> campeonatos= new CampeonatoController().iniciaConexao().getAllCampeonato();
			System.out.println("	Campeonatos cadastrados\n");
			for (Campeonato campeonato : campeonatos) {
				System.out.println(campeonato.getNome());
			}
			consultas();
			break;
		
		case 2:
			
			consultas();
			break;
			
		case 3:
			
			consultas();
			break;
		
		case 0:
			inicia();
			break;
			
		default:
			System.out.println("Digite uma opcao valida\n");
			consultas();
			break;
		
			
		}
		
	
		
	}


	private void cadastros() {
		System.out.println("\n	Cadastros\n");
		System.out.println("Digite 1: Cadastro de campeonato");
		System.out.println("Digite 2: Cadastro de times");
		System.out.println("Digite 3: Cadastro de Resultados");
		System.out.println("Digite 4: Definir rodadas");
		System.out.println("Digite 0: Para Sair\n");
		int opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Funcionalidade não disponivel no BETA :)\n");
			cadastros();
			break;
		
		case 2: // MENU CADASTRO DE TIMES
			ArrayList<Time> times=new TimeController().iniciaConexao().getAllTime();
			Campeonato campeonato=new CampeonatoController().iniciaConexao().getCampeonato(0);
			Campeonato_TimeController campeonato_TimeController=new Campeonato_TimeController();
			campeonato_TimeController.iniciaConexao().insertCampeonato_time(campeonato);
			
			int count = 0;
			
			for (Time time : times) {
				System.out.println("Codigo:"+time.getCodigo() +" Time:"+ time.getNome());
			}
			System.out.println("\n	Selecione os times\n");
			System.out.println("Utilize os codigos para inserir o time ao campeonato");
			
			while (count<20) {
				int codTime = ler.nextInt();
				if (codTime <= times.size()) {
					campeonato_TimeController.iniciaConexao().insertTime_time(times.get(codTime));		
					campeonato_TimeController.iniciaConexao().insertCampeonato_time(campeonato);
					System.out.println("\nTime Inserido:"+times.get(codTime).getNome());
					count++;
				}else {
					System.out.println("Insira um time válido");
				}
			}
			
			cadastros();
			break;
			
		case 3:
			ArrayList<Partida> partidas;
			ArrayList<Time> timesNoCampeonato=new Campeonato_TimeController().timesNoCampeonato();
			partidas=new PartidasBO().geraPartidas(timesNoCampeonato);

			break;
			
		case 4:
			
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
