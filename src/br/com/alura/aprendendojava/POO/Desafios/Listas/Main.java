package br.com.alura.aprendendojava.POO.Desafios.Listas;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(29);

        pessoa2.setNome("Livia");
        pessoa2.setIdade(32);

        pessoa3.setNome("Gustavo");
        pessoa3.setIdade(5);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size());

        System.out.println(listaDePessoas.get(0));
        for (int i = 0; i < listaDePessoas.size(); i++) {
            System.out.println(listaDePessoas.get(i));
            System.out.println(LocalDateTime.now());
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Valor 1");
        arrayList.add("Valor 2");
        arrayList.add("Valor 3");
        arrayList.add("Valor 4");
        arrayList.add("Valor 5");
        arrayList.add("Valor 6");

        for (String item : arrayList) {
            System.out.println(item);
        }






    }
}
