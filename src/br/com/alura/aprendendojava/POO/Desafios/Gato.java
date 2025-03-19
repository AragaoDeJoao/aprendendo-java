package br.com.alura.aprendendojava.POO.Desafios;

public class Gato extends Animal{
    private String raca;
    private String nome;

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som da classe Gato.");
    }
}
