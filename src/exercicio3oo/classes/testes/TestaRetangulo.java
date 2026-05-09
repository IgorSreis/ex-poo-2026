package exercicio3oo.classes.testes;

import exercicio3oo.classes.classes.Retangulo;

import java.util.Scanner;

public class TestaRetangulo {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        Retangulo novo = new Retangulo();

        System.out.println("Largura: ");
        novo.setLargura(leitor.nextDouble());

        System.out.println("Altura: ");
        novo.setAltura(leitor.nextDouble());

        System.out.println("Medidas do Retangulo");
        System.out.println("Largura é " + novo.getLargura() + ", e a altura é " + novo.getAltura());

    }
}
