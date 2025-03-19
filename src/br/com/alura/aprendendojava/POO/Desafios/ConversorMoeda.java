package br.com.alura.aprendendojava.POO.Desafios;

import br.com.alura.aprendendojava.POO.Desafios.Interface.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    private double valor;
    private final double cotacaoDolar = 5.67;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double converterDolarParaReal() {
        return getValor() * cotacaoDolar;
    }
}
