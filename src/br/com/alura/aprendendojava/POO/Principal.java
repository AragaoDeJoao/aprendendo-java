package br.com.alura.aprendendojava.POO;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Poderoso Chefão";
        filme1.anoDeLancamento = 1970;
        filme1.duracaoEmMinutos = 180;

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println(filme1.somaDasAvaliacoes);
        System.out.println(filme1.totalDeAvaliacoes);
        System.out.println(filme1.pegaMedia());
    }
}
