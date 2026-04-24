package exercicio2oo.testes;

import exercicio2oo.classes.ContaBancaria;

import java.util.Scanner;

public class TestaContaBancaria {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria nova = new ContaBancaria();

        System.out.println("Qual o numero da conta: ");
        nova.numeroConta = leitor.nextLine();
        System.out.println("Qual o nome do tituar da conta: ");
        nova.tituar = leitor.nextLine();
        System.out.println("Qual o saldo da conta: ");
        nova.saldo = leitor.nextDouble();

        System.out.println("O numero da conta é, " + nova.numeroConta + " o nome do titular é, "+nova.tituar+" com saldo de "+nova.saldo);

    }
}
