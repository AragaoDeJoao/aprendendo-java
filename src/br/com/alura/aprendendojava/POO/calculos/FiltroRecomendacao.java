package br.com.alura.aprendendojava.POO.calculos;

import br.com.alura.aprendendojava.POO.Desafios.Interface.Classificavel;

public class FiltroRecomendacao {
    private String recomendacao;


    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista pra assistir depois.");
        }
    }
}
