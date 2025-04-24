package br.com.alura.aprendendojava.POO.Principal;

import br.com.alura.aprendendojava.POO.calculos.CalculadoraDeTempo;
import br.com.alura.aprendendojava.POO.calculos.FiltroRecomendacao;
import br.com.alura.aprendendojava.POO.model.Episodio;
import br.com.alura.aprendendojava.POO.model.Filme;
import br.com.alura.aprendendojava.POO.model.Serie;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Poderoso Chefão",1970);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de Avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());

        System.out.println(filme1.getDuracaoEmMinutos());

        Serie serie = new Serie("Lost",2000);

        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        serie.setTemporadas(10);
        serie.getDuracaoEmMinutos();

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        Filme filme2 = new Filme("Avatar",2003);
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);

        calculadoraDeTempo.inclui(filme1);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        calculadoraDeTempo.inclui(filme2);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        calculadoraDeTempo.inclui(serie);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        Filme filme3 = new Filme("Dogville",2003);
        filme3.setDuracaoEmMinutos(200);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da Lista " + listaDeFilmes.size());
        System.out.println("Nome do primeiro Filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        for (Filme listaDeFilme : listaDeFilmes) {
            System.out.println(listaDeFilme.getNome());
        }



    }
}
