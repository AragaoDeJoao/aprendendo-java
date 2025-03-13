package br.com.alura.aprendendojava.primeiroCurso;

public class Estudos {
    public static void main(String[] args){


        // Desafio 02
//        double celsius = 30.2;
//        double farenheint = (celsius * 1.8) + 32;
//
//        System.out.println("A temperatura em unidade estupida é: " + farenheint);
//
//        int tempInteiro = (int) farenheint;
//
//        System.out.println("Temperatura inteiro: " + tempInteiro);

//        double nota1 = 75.5;
//        double nota2 = 62.6;
//
//        System.out.println("A média é de: " + ((nota1 + nota2)/2));
//
//        double varDouble = 7.6;
//        int varInt = (int) varDouble;
//        System.out.println(varInt);

//        char letra = 'A';
//        String palavra = "lura";
//
//        System.out.println(letra+palavra);

//        double precoProduto = 8.90;
//        int quantidade = 20;
//
//        System.out.println("Total da compra: " + (precoProduto * quantidade));

//        double valorEmDolares = 70.0;
//        double valorEmReais = valorEmDolares * 4.94;
//        System.out.println(valorEmReais);
//
//        double precoOriginal = 450.0;
//        double percentualDesconto = 10;
//
//        System.out.println("Preço com Desconto: " + (precoOriginal - (percentualDesconto/100) * precoOriginal));

        /*
        Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para 
        que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número 
        digitado pelo usuário é maior ou menor do que o número gerado.

        
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 1;
        int chute = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a " + tentativas + "a tentativa:");
            chute = scanner.nextInt();

            if (chute < numeroAleatorio){
                System.out.println("O Numero aleatório é Maior");
                tentativas++;
            } else if (chute > numeroAleatorio){
                System.out.println("O Numéro Aleatório é Menor");
                tentativas++;
            } else if (chute == numeroAleatorio){
                System.out.println("Parabéns, você acertou o Número Aleatório com " + tentativas + " tentativas");
                break;
            } else if (chute > 100){
                System.out.println("Número inválido");
                tentativas++;
            }

            if (tentativas > 5){
                System.out.println("VocÊ atingiu o Limite de tentativas, perdeu o jogo.");
                System.out.println("O número era: " + numeroAleatorio);
                break;
            }
        }

         */

        /*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um número: ");
//        int numero = scanner.nextInt();
//        if (numero > 0){
//            System.out.println("numero positivo");
//        } else {
//            System.out.println("numero negativo");
//        }

        /*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/

//        System.out.println("Digite 2 numeros:");
//        Scanner scanner = new Scanner(System.in);
//        int numero1 = scanner.nextInt();
//        int numero2 = scanner.nextInt();
//
//        if (numero1 > numero2){
//            System.out.println("O numero " + numero1 + " é maior que o número " + numero2);
//        } else if (numero2 > numero1){
//            System.out.println("O número " + numero2 + " é maior que o número " + numero1);
//        } else {
//            System.out.println("Os número " + numero1 + " e " + numero2 + " são iguais.");
//        }

        /*Crie um menu que oferece duas opções ao usuário:
        "1. Calcular área do quadrado" e
        "2. Calcular área do círculo".
         Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

//        System.out.println("Digite uma opção: ");
//        System.out.println("0. Pra Sair");
//        System.out.println("1. Calcular área do quadrado");
//        System.out.println("2. Calcular área do circulo");
//        Scanner scanner = new Scanner(System.in);
//        int escolha = scanner.nextInt();
//        int ladoQuadrado = 0;
//        int raioCirculo = 0;
//
//        while (escolha != 0)
//        if(escolha == 1){
//            System.out.println("Digite o lado do quadrado:");
//            ladoQuadrado = scanner.nextInt();
//            System.out.println("A área do quadrado é de " + (ladoQuadrado * ladoQuadrado) + "m²" );
//            System.out.println("Digite outro número: ");
//            escolha = scanner.nextInt();
//        } else if (escolha == 2){
//            System.out.println("Digite o Raio do Círculo:"); // Pi.r²
//            raioCirculo = scanner.nextInt();
//            System.out.println("A área do círculo é de " + (3.14 * (raioCirculo * raioCirculo)) +"m²");
//            System.out.println("Digite outro número: ");
//            escolha = scanner.nextInt();
//        } else {
//            System.out.println("Número inválido");
//            System.out.println("Digite outro número: ");
//            escolha = scanner.nextInt();
//        }

        /*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/

//        int tabuada = 1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um número para saber sua tabuada: ");
//        int numero = scanner.nextInt();
//
//        while (tabuada != 11){
//            System.out.println(numero + " x " + tabuada + " = " + (numero*tabuada));
//            tabuada++;
//        }

        /*Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/

//        System.out.println("Digite um número: ");
//        Scanner scanner = new Scanner(System.in);
//        int numero = scanner.nextInt();
//
//        if (numero % 2 == 0){
//            System.out.println("Numero Par");
//        } else {
//            System.out.println("Numero ímpar");
//        }

        /*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/

//        System.out.println("Digite um número para saber seu Fatorial: ");
//        Scanner scanner = new Scanner(System.in);
//        int numero = scanner.nextInt();
//        int contador = numero - 1;
//        int fatorial = 0;
//
//        for (int i = 0; i < numero; i++) {
//            fatorial = fatorial + (numero * contador);
//            contador--;
//        }
//        System.out.println("Fatorial de " + numero + " é igual a " + fatorial);


    }

}
