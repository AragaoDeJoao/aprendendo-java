package br.com.alura.aprendendojava.POO.Desafio_Final.model;

import br.com.alura.aprendendojava.POO.Desafio_Final.Interfaces.Audio;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto.");
        } else {
            System.out.println(audio.getTitulo() + " é uma boa opção pra depois.");
        }
    }

}
