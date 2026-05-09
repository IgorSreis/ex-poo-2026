package exercicio3oo.classes.testes;

import exercicio3oo.classes.classes.Aluno;

import java.util.Scanner;

class TestaAluno {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        Aluno novo = new Aluno();

        System.out.println("Nome: ");
        novo.setNome(leitor.nextLine());

        System.out.println("Matricula: ");
        novo.setMatricula(leitor.nextLine());

        System.out.println("Idade: ");
        novo.setIdade(leitor.nextInt());

        System.out.println("Nota 1: ");
        novo.setNota1(leitor.nextInt());

        System.out.println("Nota 2: ");
        novo.setNota2(leitor.nextInt());

        System.out.println("Nota 3: ");
        novo.setNota3(leitor.nextInt());

        System.out.println("Nota 4: ");
        novo.setNota4(leitor.nextInt());

        System.out.println("Dados do Aluno");
        System.out.println("Nome: " + novo.getNome());
        System.out.println("Matricula: " + novo.getMatricula());
        System.out.println("Idade: " + novo.getIdade());
        System.out.println("Nota 1: " + novo.getNota1());
        System.out.println("Nota 2: " + novo.getNota2());
        System.out.println("Nota 3: " + novo.getNota3());
        System.out.println("Nota 4: " + novo.getNota4());
    }
}
