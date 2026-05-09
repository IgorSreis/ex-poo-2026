package exercicio3oo.classes.testes;

import exercicio3oo.classes.classes.Circulo;

import java.util.Scanner;

public class TestaCirculo {
    static void main(){

        Scanner leitor = new Scanner(System.in);
        Circulo novo = new Circulo();
        System.out.println("Qual o raio do circulo: " );
        novo.setRaio(leitor.nextDouble());

        System.out.println("O raio do circuo é :" + novo.getRaio());


    }
}
