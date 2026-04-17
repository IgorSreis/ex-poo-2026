package exercicio1oo.classes;

import java.util.Scanner;

class TestaAluno {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        Aluno novo = new Aluno();

        System.out.println("Nome: ");
        novo.nome = leitor.nextLine();

        System.out.println("Matricula: ");
        novo.matricula = leitor.nextLine();

        System.out.println("Idade: ");
        novo.idade = leitor.nextInt();

        System.out.println("Nota 1: ");
        novo.nota1 = leitor.nextInt();

        System.out.println("Nota 2: ");
        novo.nota2 = leitor.nextInt();

        System.out.println("Nota 3: ");
        novo.nota3 = leitor.nextInt();

        System.out.println("Nota 4: ");
        novo.nota4 = leitor.nextInt();

        System.out.println("Dados do Aluno");
        System.out.println("Nome: " + novo.nome);
        System.out.println("Matricula: " + novo.matricula);
        System.out.println("Idade: " + novo.idade);
        System.out.println("Nota 1: " + novo.nota1);
        System.out.println("Nota 2: " + novo.nota2);
        System.out.println("Nota 3: " + novo.nota3);
        System.out.println("Nota 4: " + novo.nota4);
    }
}
