package org.tekyoh.models;


import javax.swing.*;

public class Tabuleiro {
    private Player jogador1;
    private Player jogador2;
    private Peca[][] posicoes = new Peca[8][8];

    public Tabuleiro(Player jogador1, Player jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        configurarPecasIniciais();
    }

    public Peca[][] getPosicoes() {
        return posicoes;
    }

    public void setPosicoes(Peca[][] posicoes) {
        this.posicoes = posicoes;
    }

    // Funções
    private void configurarPecasIniciais() {
        // Inicialize e coloque as peças no tabuleiro
        // Parte de cima do tabuleiro (pecas pretas)
        posicoes[0][0] = new Peca("Torre", 'T');
        posicoes[0][1] = new Peca("Cavalo", 'C');
        posicoes[0][2] = new Peca("Bispo", 'B');
        posicoes[0][3] = new Peca("Dama", 'D');
        posicoes[0][4] = new Peca("Rei", 'R');
        posicoes[0][5] = new Peca("Bispo", 'B');
        posicoes[0][6] = new Peca("Cavalo", 'C');
        posicoes[0][7] = new Peca("Torre", 'T');

        for (int i = 0; i < 8; i++) {
            posicoes[1][i] = new Peca("Peão", 'P'); // Peoes pretos
            posicoes[6][i] = new Peca("Peão", 'P'); // Peoes brancos
        }

        // Parte de baixo do tabuleiro (pecas brancas)
        posicoes[7][0] = new Peca("Torre", 'T');
        posicoes[7][1] = new Peca("Cavalo", 'C');
        posicoes[7][2] = new Peca("Bispo", 'B');
        posicoes[7][3] = new Peca("Dama", 'D');
        posicoes[7][4] = new Peca("Rei", 'R');
        posicoes[7][5] = new Peca("Bispo", 'B');
        posicoes[7][6] = new Peca("Cavalo", 'C');
        posicoes[7][7] = new Peca("Torre", 'T');

        // Caso o jogador1 escolha a cor preta
        if (jogador1.getCorPeca().equals('P')) {
            for (int i = 0; i < 8; i++) {
                // Setando o jogador1 para as pecas pretas
                posicoes[0][i].setJogador(jogador1);
                posicoes[1][i].setJogador(jogador1);

                // Setando o jogador2 para as pecas brancas
                posicoes[6][i].setJogador(jogador2);
                posicoes[7][i].setJogador(jogador2);
            }
        // Caso o jogador2 escolha a cor preta
        } else {
            for (int i = 0; i < 8; i++) {
                // Setando o jogador2 para as pecas pretas
                posicoes[0][i].setJogador(jogador2);
                posicoes[1][i].setJogador(jogador2);

                // Setando o jogador1 para as pecas brancas
                posicoes[6][i].setJogador(jogador1);
                posicoes[7][i].setJogador(jogador1);
            }
        }


        // Printar no terminal o tabuleiro ja criado
        String tabuleiroMontado = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiroMontado += posicoes[i][j] + " ";
            }
            tabuleiroMontado += "\n";
        }
        System.out.println("Tabuleiro criado!\n" + tabuleiroMontado);
    }
}
