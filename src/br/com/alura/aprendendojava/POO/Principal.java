package br.com.alura.aprendendojava.POO;

import br.com.alura.aprendendojava.POO.calculos.CalculadoraDeTempo;
import br.com.alura.aprendendojava.POO.calculos.FiltroRecomendacao;
import br.com.alura.aprendendojava.POO.model.Episodio;
import br.com.alura.aprendendojava.POO.model.Filme;
import br.com.alura.aprendendojava.POO.model.Serie;

import java.io.Closeable;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Poderoso Chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de Avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());

        System.out.println(filme1.getDuracaoEmMinutos());

        Serie serie = new Serie();

        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        serie.setTemporadas(10);
        serie.getDuracaoEmMinutos();

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
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

        // https://cursos.alura.com.br/course/java-aplicando-orientacao-objetos/task/126199 Aula 05
    }
}
