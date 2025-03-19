package br.com.alura.aprendendojava.POO.Desafios.Clases;

import br.com.alura.aprendendojava.POO.Desafios.Interface.Vendavel;

public class Produto implements Vendavel {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calculaPrecoFinal(int quantidade) {
        if (quantidade <= 5 && quantidade >= 3){
            return  getPreco() - (getPreco() * 0.2);
        } else if (quantidade <=  8){
            return  getPreco() - (getPreco() * 0.3);
        } else {
            return  getPreco() - (getPreco() * 0.4);
        }
    }
}
