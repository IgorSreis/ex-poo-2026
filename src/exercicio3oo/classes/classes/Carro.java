package exercicio3oo.classes.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
