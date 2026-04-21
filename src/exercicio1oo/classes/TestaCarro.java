package exercicio1oo.classes;

import java.util.Scanner;

public class TestaCarro {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        Carro novo = new Carro();


        System.out.println("Qual modelo do carro");
        novo.modelo = leitor.nextLine();
        System.out.println("Qual a marca do carro");
        novo.marca = leitor.nextLine();
        System.out.println("Qual ano do carro");
        novo.ano = leitor.nextInt();
        System.out.println("Qual velocidade do carro");
        novo.velocidade = leitor.nextDouble();

        System.out.println("O modelo do carro é, "+ novo.modelo);
        System.out.println("A marca do carro é, "+ novo.marca);
        System.out.println("O ano do carro é, "+ novo.ano);
        System.out.println("A velocidade do carro é, "+ novo.velocidade + " km/h");


    }
}
