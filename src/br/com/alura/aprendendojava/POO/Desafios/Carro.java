package br.com.alura.aprendendojava.POO.Desafios;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaCarro(){
        System.out.printf("""
                Modelo: %s
                Ano: %d
                Cor: %s
                %n""", modelo, ano, cor);
    }

    void calculaIdade(){
        System.out.println(2025 - ano);
    }
}
