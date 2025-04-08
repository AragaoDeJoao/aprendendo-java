package br.com.alura.aprendendojava.POO.Desafio_Final.model;

import br.com.alura.aprendendojava.POO.Desafio_Final.Interfaces.Audio;

public class Musica extends Audio {

    private String album;
    private String cantor;
    private String genero;

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
