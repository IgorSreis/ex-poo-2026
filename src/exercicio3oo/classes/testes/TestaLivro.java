package exercicio3oo.classes.testes;

import exercicio3oo.classes.classes.Livro;

import java.util.Scanner;

public class TestaLivro {
    static void main(){
        Scanner leitor = new Scanner(System.in);
        Livro novo = new Livro();

        novo.setEmprestado(true);

        System.out.print("Qual o nome do livro: ");
        novo.setTitulo(leitor.nextLine());
        System.out.print("Qual o nome do autor do livro: ");
        novo.setAutor(leitor.nextLine());
        System.out.print("Qual o genero do livro: ");
        novo.setGenero(leitor.nextLine());

        System.out.print("O livro "+ novo.getTitulo() +" do autor "+ novo.getAutor() +" do genero "+ novo.getGenero() + ".");

    }
}
