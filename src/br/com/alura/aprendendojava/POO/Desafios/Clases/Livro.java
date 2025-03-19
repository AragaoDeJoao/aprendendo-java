package br.com.alura.aprendendojava.POO.Desafios.Clases;

import br.com.alura.aprendendojava.POO.Desafios.Interface.Calculavel;

public class Livro implements Calculavel {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.5;
    }
}
