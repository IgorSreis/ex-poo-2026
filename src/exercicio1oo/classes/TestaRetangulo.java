package exercicio1oo.classes;

import java.util.Scanner;

public class TestaRetangulo {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        Retangulo novo = new Retangulo();

        System.out.println("Largura: ");
        novo.largura = leitor.nextDouble();

        System.out.println("Altura: ");
        novo.altura = leitor.nextDouble();

        System.out.println("Medidas do Retangulo");
        System.out.println("Largura é " + novo.largura + ", e a altura é " + novo.altura);

    }
}
