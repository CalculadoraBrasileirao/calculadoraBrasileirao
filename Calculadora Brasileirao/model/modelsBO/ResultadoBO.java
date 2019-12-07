package modelsBO;

import java.util.ArrayList;

import modelsVO.Partida;
import modelsVO.Resultado;

public class ResultadoBO {

	public ArrayList<Resultado> retornaPontos(Partida partida) {
        ArrayList<Resultado> listResultado = new ArrayList<Resultado>();

        Resultado resultado1 = new Resultado(), resultado2 = new Resultado();


        if (partida.getGolsMandante() > partida.getGolsVisitante()) {
            resultado1.setVitorias(1);
            resultado1.setGols(partida.getGolsMandante());
            resultado1.setPontos(3);
            listResultado.add(resultado1);
            resultado2.setDerrotas(1);
            resultado2.setGols(partida.getGolsVisitante());
            resultado2.setPontos(0);
            listResultado.add(resultado2);
        } else { 
            if (partida.getGolsMandante() < partida.getGolsVisitante()) {
                resultado1.setDerrotas(1);
                resultado1.setGols(partida.getGolsMandante());
                resultado1.setPontos(0);
                listResultado.add(resultado1);
                resultado2.setVitorias(1);
                resultado2.setGols(partida.getGolsVisitante());
                resultado2.setPontos(3);
                listResultado.add(resultado2);
            } else {
                resultado1.setEmpates(1);
                resultado1.setGols(partida.getGolsMandante());
                resultado1.setPontos(1);
                listResultado.add(resultado1);
                resultado2.setEmpates(1);
                resultado2.setGols(partida.getGolsVisitante());
                resultado2.setPontos(1);
                listResultado.add(resultado2);
            }
        }

        return listResultado;
    }
	
}
