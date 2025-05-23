package br.com.alura.aprendendojava.POO.Desafios.Clases;

public class Desafio {
    public static void main(String[] args) {
        Formatacao f = new Formatacao();
//
//        /* 1. Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console. */
//        Pessoa p = new Pessoa();
//        p.exibeOlaMundo();
//
//        f.divideDesafio();
//
//        /* 2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número. */
//        Calculadora calculadora = new Calculadora();
//        System.out.println(calculadora.dobro(15));
//
//        f.divideDesafio();
//
//        /* 3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e
//        métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
//        */
//
//        Musica m = new Musica();
//        m.artista = "Angra";
//        m.titulo = "Holy Land";
//        m.anoDeLancamento = 1995;
//        m.avaliacao = 10.0;
//
//        m.exibeFichaTecnica();
//        m.avaliaMusica(10);
//        m.avaliaMusica(11);
//        m.avaliaMusica(9);
//        m.avaliaMusica(6);
//        m.calculaMedia();
//
//        m.exibeFichaTecnica();
//
//        f.divideDesafio();
//
//        /* 4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro. */
//
//        Carro c = new Carro();
////        c.modelo = "Fox";
////        c.ano = 2016;
////        c.cor = "Branco";
//
//        c.exibeFichaCarro();
//        c.calculaIdade();
//
//        f.divideDesafio();
//
//        /* 5.  Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
//         Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
//         */
//
//        Aluno a = new Aluno();
//        a.nome = "João";
//        a.idade = 29;
//        a.exibeAluno();
//
//        f.divideDesafio();

//        Gato gato1 = new Gato();
//        gato1.emitirSom();
//
//        Cachorro cachorro = new Cachorro();
//        cachorro.emitirSom();
//
//        Animal animal = new Animal();
//        animal.emitirSom();

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
        c.setModelo("Fox");
        c.setAno(2016);
        c.setCor("Branco");

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

        ConversorTemperaturaPadrao ctp = new ConversorTemperaturaPadrao();
        System.out.println(ctp.celsiusParaFahrenheit(20));
        System.out.println(ctp.fahrenheitParaCelsius(20));

        formatacao.divideDesafio();

        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();

        livro.setPreco(20.5);
        produtoFisico.setPreco(20.5);

        System.out.println(livro.calcularPrecoFinal());
        System.out.println(produtoFisico.calcularPrecoFinal());

        Produto produto = new Produto();
        produto.setPreco(10);
        System.out.println(produto.calculaPrecoFinal(4));
        System.out.println(produto.calculaPrecoFinal(6));
        System.out.println(produto.calculaPrecoFinal(10));

        Servico servico = new Servico();
        servico.setPreco(10);
        System.out.println(servico.calculaPrecoFinal(4));
        System.out.println(servico.calculaPrecoFinal(6));
        System.out.println(servico.calculaPrecoFinal(10));


    }
}
