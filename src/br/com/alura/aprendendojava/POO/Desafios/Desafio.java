package br.com.alura.aprendendojava.POO.Desafios;

import java.text.Format;

public class Desafio {
    public static void main(String[] args) {
        Formatacao formatacao = new Formatacao();

        /* 1. Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console. */
        Pessoa p = new Pessoa();
        p.exibeOlaMundo();

        formatacao.divideDesafio();

        /* 2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número. */
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobro(15));

        formatacao.divideDesafio();

        /* 3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e
        métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        */

        Musica m = new Musica();
        m.artista = "Angra";
        m.titulo = "Holy Land";
        m.anoDeLancamento = 1995;
        m.avaliacao = 10.0;

        m.exibeFichaTecnica();
        m.avaliaMusica(10);
        m.avaliaMusica(11);
        m.avaliaMusica(9);
        m.avaliaMusica(6);
        m.calculaMedia();

        m.exibeFichaTecnica();

        formatacao.divideDesafio();

        /* 4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro. */

        Carro c = new Carro();
        c.modelo = "Fox";
        c.ano = 2016;
        c.cor = "Branco";

        c.exibeFichaCarro();
        c.calculaIdade();

        formatacao.divideDesafio();

        /* 5.  Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
         Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
         */

        Aluno a = new Aluno();
        a.nome = "João";
        a.idade = 29;
        a.exibeAluno();

        formatacao.divideDesafio();

        ConversorMoeda cm = new ConversorMoeda();

        formatacao.divideDesafio();

        cm.setValor(10.0);
        System.out.println(cm.converterDolarParaReal());

        formatacao.divideDesafio();


        CalculadoraSalaRetangular csr = new CalculadoraSalaRetangular();
        csr.setAltura(10);
        csr.setLargura(20);

        System.out.println("Área: " + csr.calcularArea());
        System.out.println("Perímetro: " + csr.calcularPerimetro());

        // https://cursos.alura.com.br/course/java-aplicando-orientacao-objetos/task/146318 Exercício 03



    }
}
