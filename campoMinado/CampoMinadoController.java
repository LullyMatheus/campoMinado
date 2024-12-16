package com.campoMinado;

import java.util.Scanner;

import com.jogodetabuleiro.Tabuleiro;
import com.jogodetabuleiro.TabuleiroController;
import com.jogodetabuleiro.TabuleiroView;

public class CampoMinadoController extends TabuleiroController<Character> {
    private char jogadorAtual = 'X';

    public CampoMinadoController(Tabuleiro<Character> tabuleiro, TabuleiroView<Character> view) {
        super(tabuleiro, view);
    }

    /**public void jogar() {
        Scanner scanner = new Scanner(System.in);
        boolean fimDeJogo = false;

        while (!fimDeJogo) {
            view.mostrarMensagem("Jogador " + jogadorAtual + ", faça sua jogada!");
            view.exibirTabuleiro(tabuleiro);

            System.out.print("Linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (tabuleiro.getCelula(linha, coluna) == null) {
                tabuleiro.setCelula(linha, coluna, jogadorAtual);
                if (((CampoMinado) tabuleiro).verificarVitoria(jogadorAtual)) {
                    view.exibirTabuleiro(tabuleiro);
                    view.mostrarMensagem("Jogador " + jogadorAtual + " venceu!");
                    fimDeJogo = true;
                } else if (((CampoMinado) tabuleiro).verificarEmpate()) {
                    view.exibirTabuleiro(tabuleiro);
                    view.mostrarMensagem("Empate!");
                    fimDeJogo = true;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X'; // Troca o jogador
                }
            } else {
                view.mostrarMensagem("Célula já ocupada! Tente novamente.");
            }
        }

        scanner.close();
    }*/
}