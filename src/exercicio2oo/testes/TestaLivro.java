package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

import java.util.Scanner;

public class TestaLivro {
    static void main(){
        Scanner leitor = new Scanner(System.in);
        Livro novo = new Livro();

        novo.emprestado = true;

        System.out.print("Qual o nome do livro: ");
        novo.titulo = leitor.nextLine();
        System.out.print("Qual o nome do autor do livro: ");
        novo.autor = leitor.nextLine();
        System.out.print("Qual o genero do livro: ");
        novo.genero = leitor.nextLine();

        System.out.print("O livro "+novo.titulo+" do autor "+novo.autor+" do genero "+novo.genero+ ".");

        if (novo.emprestado==true){
            System.out.println(" Está emprestado!");
        }else{
            System.out.println(" Não está emprestado!");
        }
    }
}
