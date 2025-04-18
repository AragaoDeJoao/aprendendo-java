package br.com.alura.aprendendojava.POO.Desafio_Final.model;

import br.com.alura.aprendendojava.POO.Desafio_Final.Interfaces.Audio;

public class Podcast extends Audio {

    private String host;
    private String descricao;
    private String apresentador;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        } else
        {
            return 8;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
