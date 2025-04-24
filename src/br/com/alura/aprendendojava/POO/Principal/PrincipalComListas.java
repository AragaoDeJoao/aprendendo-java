package br.com.alura.aprendendojava.POO.Principal;

import br.com.alura.aprendendojava.POO.model.Filme;
import br.com.alura.aprendendojava.POO.model.Serie;
import br.com.alura.aprendendojava.POO.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Poderoso Chefão",1970);
        Serie serie = new Serie("Lost",2000);
        Filme filme2 = new Filme("Avatar",2003);
        Filme filme3 = new Filme("Dogville",2003);

        filme1.avalia(9);
        filme2.avalia(6);
        filme3.avalia(10);




        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme3);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Joao");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println(lista);



    }
}
