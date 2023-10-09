package org.tekyoh;


import org.tekyoh.controller.Jogo;
import org.tekyoh.models.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Inicia o tabuleiro
        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JTextField player1Field = new JTextField(15);
        JTextField player2Field = new JTextField(15);
        JRadioButton pecaBrancaPl1 = new JRadioButton("Branco");
        JRadioButton pecaPretaPl1 = new JRadioButton("Preto");
        JRadioButton pecaBrancaPl2 = new JRadioButton("Branco");
        JRadioButton pecaPretaPl2 = new JRadioButton("Preto");

        // Crie grupos de botões para garantir que apenas um seja selecionado para cada jogador
        ButtonGroup grupoPl1 = new ButtonGroup();
        grupoPl1.add(pecaBrancaPl1);
        grupoPl1.add(pecaPretaPl1);

        ButtonGroup grupoPl2 = new ButtonGroup();
        grupoPl2.add(pecaBrancaPl2);
        grupoPl2.add(pecaPretaPl2);

        Font font = new Font("Arial", Font.BOLD, 16);

        JPanel player1Panel = new JPanel(new GridLayout(4, 2));
        player1Panel.setBorder(BorderFactory.createTitledBorder("Player 1"));
        player1Panel.setFont(font);

        JLabel nameLabel1 = new JLabel("Nome: ");
        nameLabel1.setFont(font);

        player1Panel.add(nameLabel1);
        player1Panel.add(player1Field);
        player1Panel.add(new JLabel("Cor da peça"));
        player1Panel.add(pecaBrancaPl1);
        player1Panel.add(new JLabel());
        player1Panel.add(pecaPretaPl1);

        JPanel player2Panel = new JPanel(new GridLayout(4, 2));
        player2Panel.setBorder(BorderFactory.createTitledBorder("Player 2"));
        player2Panel.setFont(font);

        JLabel nameLabel2 = new JLabel("Nome: ");
        nameLabel2.setFont(font);

        player2Panel.add(nameLabel2);
        player2Panel.add(player2Field);
        player2Panel.add(new JLabel("Cor da peça"));
        player2Panel.add(pecaBrancaPl2);
        player2Panel.add(new JLabel());
        player2Panel.add(pecaPretaPl2);

        mainPanel.add(player1Panel);
        mainPanel.add(player2Panel);

        JButton jogarButton = new JButton("Jogar");
        JButton sairButton = new JButton("Sair");

        mainPanel.add(jogarButton);
        mainPanel.add(sairButton);

        JFrame createPlayerFrame = new JFrame("Xadrez ♟");

        //createPlayerFrame.setIconImage(new ImageIcon(Main.class.getResource("/icone/icon.png")).getImage());
        createPlayerFrame.setIconImage(new ImageIcon(Objects.requireNonNull(Main.class.getResource("/icone/icon.png"))).getImage());


        createPlayerFrame.setSize(345, 325);
        createPlayerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createPlayerFrame.getContentPane().add(mainPanel);
        createPlayerFrame.setResizable(false);
        createPlayerFrame.setVisible(true);

        // Define a seleção padrão para Player 1 como "Branco" e para Player 2 como "Preto"
        pecaBrancaPl1.setSelected(true);
        pecaPretaPl2.setSelected(true);

        // Adicione um ActionListener para o botão "Jogar"
        jogarButton.addActionListener(e -> {
            // Ele pega a primeira letra da cor selecionada para criar o char(Character) de cor
            String corPlayer1 = pecaBrancaPl1.isSelected() ? "Branco" : "Preto";
            Player jogador1 = new Player(player1Field.getText(), corPlayer1.charAt(0));

            String corPlayer2 = pecaBrancaPl2.isSelected() ? "Branco" : "Preto";
            Player jogador2 = new Player(player2Field.getText(), corPlayer2.charAt(0));

            // Inicia o jogo
            new Jogo(jogador1, jogador2);
        });

        // Adicione um ActionListener para o botão "Cancelar"
        sairButton.addActionListener(e -> {
            createPlayerFrame.dispose();
        });

        // Adicione um ActionListener aos botões de rádio do Player 1 para alternar a seleção do Player 2
        pecaBrancaPl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pecaBrancaPl2.setSelected(!pecaBrancaPl1.isSelected());
                pecaPretaPl2.setSelected(pecaBrancaPl1.isSelected());
            }
        });

        pecaPretaPl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pecaPretaPl2.setSelected(!pecaPretaPl1.isSelected());
                pecaBrancaPl2.setSelected(pecaPretaPl1.isSelected());
            }
        });

        // Adicione um ActionListener aos botões de rádio do Player 2 para alternar a seleção do Player 1
        pecaBrancaPl2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pecaBrancaPl1.setSelected(!pecaBrancaPl2.isSelected());
                pecaPretaPl1.setSelected(pecaBrancaPl2.isSelected());
            }
        });

        pecaPretaPl2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pecaPretaPl1.setSelected(!pecaPretaPl2.isSelected());
                pecaBrancaPl1.setSelected(pecaPretaPl2.isSelected());
            }
        });
    }
}