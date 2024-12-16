package com.MenuJogo;

import java.util.Scanner;

public class MenuJogo {
    private Scanner scanner;

    // Construtor para inicializar o Scanner
    public MenuJogo() {
        scanner = new Scanner(System.in);
    }

    // Método para exibir o menu e capturar a escolha do usuário
    public int exibirMenu() {
        System.out.println("======= MENU =======");
        System.out.println("Escolha o nível de dificuldade do seu jogo:");
        System.out.println("1. Fácil");
        System.out.println("2. Médio");
        System.out.println("3. Difícil");
        System.out.println("0. Sair");
        int escolha = scanner.nextInt();
        return escolha;
    }

    // Método para processar a escolha do usuário
    /**public void processarEscolha(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu a Opção 1.");
                break;
            case 2:
                System.out.println("Você escolheu a Opção 2.");
                break;
            case 3:
                System.out.println("Você escolheu a Opção 3.");
                break;
            case 0:
                System.out.println("Encerrando o programa. Até logo!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }*/

    // Método principal para executar o menu em loop
    public int executar() {
        int escolha;
        escolha = exibirMenu();
        while (escolha >3 || escolha<0) {
            System.out.println("Valor inválido");
            escolha = exibirMenu();
        } return escolha;
    }
}
