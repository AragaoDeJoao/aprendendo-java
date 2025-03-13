package br.com.alura.aprendendojava.POO.Desafios;

public class Musica {
    /*Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.*/

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
        System.out.println(numAvaliacoes);
    }

    double avaliaMusica(double nota){
        numAvaliacoes++;
        return avaliacao += nota;
    }

    void calculaMedia(){
        System.out.println("Media de avaliações: " + avaliacao / numAvaliacoes);
    }
}
