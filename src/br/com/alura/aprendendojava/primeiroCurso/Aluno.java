package br.com.alura.aprendendojava.primeiroCurso;

public class Aluno {
    /*Desenvolva uma classe Aluno com os atributos privados nome e notas.
     Utilize métodos getters e setters para acessar e modificar esses atributos.
      Adicione um método calcularMedia que retorna a média das notas do aluno.*/

    private String nome;
    private double notas;

    public double calcularMedia(){
        return notas / 2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
}
