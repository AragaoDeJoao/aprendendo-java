package br.com.alura.aprendendojava.primeiroCurso;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Seu filme favorito é: " + filme);

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Ano do filme: " + anoDeLancamento);

        System.out.println("Avaliação pro filme: ");
        double avaliacao = leitura.nextDouble();
        System.out.println("Avaliação do filme que você deu: " + avaliacao);

        leitura.close();

    }
}
