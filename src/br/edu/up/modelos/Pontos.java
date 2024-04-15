package br.edu.up.modelos;

public class Pontos {
    
    private double x;
    private double y;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Pontos(){
        this.y=0;
        this.x=0;
    }

    public Pontos(double x, double y){
        this.y=0;
        this.x=0;
    }

    public double calcularDistancia(){
        return Math.sqrt(Math.pow(x*1-x*2,2)+Math.pow(y*1-y*2,2));//Calculo da Distância
    }

}



