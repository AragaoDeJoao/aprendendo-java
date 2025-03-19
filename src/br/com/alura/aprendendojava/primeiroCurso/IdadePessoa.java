package br.com.alura.aprendendojava.primeiroCurso;

public class IdadePessoa {

    /*Crie uma classe IdadePessoa com os atributos privados nome e idade.
     Utilize métodos getters e setters para acessar e modificar esses atributos.
     Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
     */

    private String nome;
    private int idade;

    public void verificarIdade(){
        if (this.idade >= 18){
            System.out.println("Pessoa Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
