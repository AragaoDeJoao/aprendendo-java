package br.com.alura.aprendendojava.POO.Desafio_Final.Interfaces;

public class Audio {

   private String titulo;
   private int totalReproducoes;
   private int totalCurtidas;
   private int classificacao;


   public void curte(){
    this.totalCurtidas++;
   }

   public void reproduz(){
    this.totalReproducoes++;
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
