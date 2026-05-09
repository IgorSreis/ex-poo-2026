package exercicio3oo.classes.classes;

public class ContaoBancaria {
    private String numeroConta;
    private String tituar;
    private double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTituar() {
        return tituar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTituar(String tituar) {
        this.tituar = tituar;
    }
}
