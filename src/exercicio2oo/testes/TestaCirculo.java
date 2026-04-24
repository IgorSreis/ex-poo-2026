package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

import java.util.Scanner;

public class TestaCirculo {
    static void main(){

        Scanner leitor = new Scanner(System.in);
        Circulo novo = new Circulo();
        System.out.println("Qual o raio do circulo: " );
        novo.raio = leitor.nextDouble();

        System.out.println("O raio do circuo é :" + novo.raio);


    }
}
