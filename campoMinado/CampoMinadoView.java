package com.campoMinado;

import com.jogodetabuleiro.Tabuleiro;
import com.jogodetabuleiro.TabuleiroView;

public class CampoMinadoView extends TabuleiroView<Character> {

    /**@Override
    public void exibirTabuleiro(Tabuleiro<Character> tabuleiro) {
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                Character conteudo = tabuleiro.getCelula(i, j);
                if (conteudo == null) {
                    System.out.print("   "); // Espaço vazio
                } else {
                    System.out.print(" " + conteudo + " ");
                }
                if (j < 2) System.out.print("|"); // Divisores entre colunas
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---"); // Divisores entre linhas
        }
    }*/
}
