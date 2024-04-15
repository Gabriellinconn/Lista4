package br.edu.up.controles;

import br.edu.up.modelos.Pontos;

public class ControlePontos {

    Pontos ponto1 = new Pontos();
    Pontos ponto2 = new Pontos(2,5);
    Pontos outraCord = new Pontos(7,2);

    public double calcularDistancia(){
        return Math.sqrt(Math.pow(getX*1-x*2,2)+Math.pow(y*1-y*2,2));//Calculo da Distância
    }

    double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto1, ponto2);

    
}
