package exercicio3oo.classes.testes;

import exercicio3oo.classes.classes.Carro;

import java.util.Scanner;

public class TestaCarro {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        Carro novo = new Carro();


        System.out.println("Qual modelo do carro");
        novo.setModelo(leitor.nextLine());
        System.out.println("Qual a marca do carro");
        novo.setMarca(leitor.nextLine());
        System.out.println("Qual ano do carro");
        novo.setAno(leitor.nextInt());
        System.out.println("Qual velocidade do carro");
        novo.setVelocidade(leitor.nextDouble());

        System.out.println("O modelo do carro é, "+ novo.getModelo());
        System.out.println("A marca do carro é, "+ novo.getMarca());
        System.out.println("O ano do carro é, "+ novo.getAno());
        System.out.println("A velocidade do carro é, "+ novo.getVelocidade() + " km/h");


    }
}
