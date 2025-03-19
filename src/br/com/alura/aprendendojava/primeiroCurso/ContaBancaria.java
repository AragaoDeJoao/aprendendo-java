package br.com.alura.aprendendojava.primeiroCurso;

public class ContaBancaria {
            /* Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
         Implemente métodos getters e setters para os atributos privados.
         */

    private int numeroConta;
    private double saldo;
    public int titular;


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
