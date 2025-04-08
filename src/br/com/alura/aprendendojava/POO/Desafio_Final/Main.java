package br.com.alura.aprendendojava.POO.Desafio_Final;

import br.com.alura.aprendendojava.POO.Desafio_Final.model.MinhasPreferidas;
import br.com.alura.aprendendojava.POO.Desafio_Final.model.Musica;
import br.com.alura.aprendendojava.POO.Desafio_Final.model.Podcast;

import javax.sound.sampled.Port;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");

        MinhasPreferidas preferidas = new MinhasPreferidas();

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);



//        System.out.println("Reprodução Musica: "+ minhaMusica.getTotalReproducoes());
//        System.out.println("Curtida Música: " + minhaMusica.getTotalCurtidas());
//        System.out.println("Reproduções Podacst: " + meuPodcast.getTotalReproducoes());
//        System.out.println("Curtidas Podcast: " + meuPodcast.getTotalCurtidas());

    }
}
