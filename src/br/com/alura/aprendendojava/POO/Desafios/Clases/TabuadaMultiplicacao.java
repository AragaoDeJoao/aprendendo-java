package br.com.alura.aprendendojava.POO.Desafios.Clases;

import br.com.alura.aprendendojava.POO.Desafios.Interface.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {


    @Override
    public void tabuada(int valor) {
        for (int i = 1; i < 11; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
}
