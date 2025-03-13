package br.com.alura.aprendendojava.primeiroCurso;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        double saldo = 5000.0;
        String nome = "Joao Carlos";
        String tipoConta = "Conta Corrente";

        System.out.println(String.format("""
                ********* Dados Iniciais **********
                                
                Nome: "%s"
                Tipo de Conta:  "%s"
                Saldo disponível %.2f R$
                                
                ***********************************
                """, nome, tipoConta, saldo));

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        double receberValor = 0.0;
        double transferirValor = 0.0;

        while (opcao != 4) {
            System.out.println("""
                                    
                    Digite uma opção: 
                    1. Consultar Saldos
                    2. Receber Valor
                    3. Transferir Valor
                    4. Sair
                                    
                    """);
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Seu saldo é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite quanto você vai receber:");
                receberValor = scanner.nextDouble();
                saldo += receberValor;
                System.out.println("Seu saldo atual é de " + saldo);
            } else if (opcao == 3) {
                System.out.println("Quanto você vai transferir?");
                transferirValor = scanner.nextDouble();
                if (transferirValor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= transferirValor;
                }
                System.out.println("Seu saldo atual é de " + saldo);
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida");
            }

        }


    }
}
