package exercicio3oo.classes.testes;

import exercicio3oo.classes.classes.ContaoBancaria;

import java.util.Scanner;

public class TestaContaoBancaria {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        ContaoBancaria nova = new ContaoBancaria();

        System.out.println("Qual o numero da conta: ");
        nova.setNumeroConta(leitor.nextLine());
        System.out.println("Qual o nome do tituar da conta: ");
        nova.setTituar(leitor.nextLine());
        System.out.println("Qual o saldo da conta: ");
        nova.setSaldo(leitor.nextDouble());

        System.out.println("O numero da conta é, " + nova.getNumeroConta() + " o nome do titular é, " + nova.getTituar() + " com saldo de " + nova.getSaldo());
    }
}
