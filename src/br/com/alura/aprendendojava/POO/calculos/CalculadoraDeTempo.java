package br.com.alura.aprendendojava.POO.calculos;

import br.com.alura.aprendendojava.POO.model.Filme;
import br.com.alura.aprendendojava.POO.model.Serie;
import br.com.alura.aprendendojava.POO.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

//    public void inclui(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }

//    public void inclui (Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }
}
