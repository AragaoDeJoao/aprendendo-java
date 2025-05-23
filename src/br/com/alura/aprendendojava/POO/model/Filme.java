package br.com.alura.aprendendojava.POO.model;

import br.com.alura.aprendendojava.POO.Desafios.Interface.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }


    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }



}
