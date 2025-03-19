package br.com.alura.aprendendojava.POO.Desafios.Clases;

public class Cachorro extends Animal {
    private String raca;
    private String nome;

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som da classe Cachorro");
    }
}
