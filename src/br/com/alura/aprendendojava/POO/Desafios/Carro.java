package br.com.alura.aprendendojava.POO.Desafios;

public class Carro {
    /* Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
     Implemente métodos para definir o nome do modelo,
     os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
      Adicione uma subclasse ModeloCarro para criar instâncias específicas,
      utilizando-a na classe principal para definir preços e mostrar informações.*/

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;

    public void precoMedioPorAno(){

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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
