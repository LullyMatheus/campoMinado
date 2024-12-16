package com.campoMinado;

import com.jogodetabuleiro.Tabuleiro;

public class CampoMinado extends Tabuleiro<Character> {

    public CampoMinado(int linhas, int colunas) {
        super(linhas, colunas);
    }

    /**public boolean verificarVitoria(char jogador) {
        // Verifica linhas
        for (int i = 0; i < 3; i++) {
            if (verificaJogador(i, 0, jogador) &&
                verificaJogador(i, 1, jogador) && 
                verificaJogador(i, 2, jogador)) {
                return true;
            }
        }
        // Verifica colunas
        for (int j = 0; j < 3; j++) {
            if (verificaJogador(0, j, jogador) &&
                verificaJogador(1, j, jogador) &&
                verificaJogador(2, j, jogador)) {
                return true;
            }
        }
        // Verifica diagonais
        if (verificaJogador(0, 0, jogador) &&
            verificaJogador(1, 1, jogador) &&
            verificaJogador(2, 2, jogador)) {
            return true;
        }
        if (verificaJogador(0, 2, jogador) &&
            verificaJogador(1, 1, jogador) && 
            verificaJogador(2, 0, jogador)) {
            return true;
        }
        return false;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                if (getCelula(i, j) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean verificaJogador(int i, int j, Character jogador){
        Character valorCelula = getCelula(i, j);
        return valorCelula == null ? false : (valorCelula == jogador);
    }*/
}
