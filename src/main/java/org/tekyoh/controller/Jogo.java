package org.tekyoh.controller;


import org.tekyoh.models.Tabuleiro;
import org.tekyoh.models.Player;

import javax.swing.*;
import java.awt.*;

public class Jogo {
    private Player jogador1;
    private Player jogador2;

    public Jogo(Player jogador1, Player jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;

        Tabuleiro tabuleiro = new Tabuleiro(jogador1, jogador2);
        iniciarJogo();
    }

    public void iniciarJogo() {
        JPanel panel = new JPanel(new GridLayout(10, 8));


        JFrame gameFrame = new JFrame("Xadrez ♟ - Em jogo");
        gameFrame.setSize(400, 300);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.getContentPane().add(panel);
        gameFrame.setVisible(true);
    }
}
