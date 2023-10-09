package org.tekyoh;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Teste2 {
    public static void main(String[] args) {
        // Cria um JFrame
        JFrame frame = new JFrame("Exemplo de JButton com Imagem");

        // Define o tamanho do JFrame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um JButton
        JButton botao = new JButton("Clique Aqui");

        // Carrega uma imagem para usar como ícone do classpath
        //ImageIcon icone = new ImageIcon(Teste2.class.getResource("/pecas/pretas/rei.png"));
        ImageIcon icone = new ImageIcon(Objects.requireNonNull(Teste2.class.getResource("/pecas/pretas/rei.png")));


        // Define o ícone do botão como a imagem carregada
        botao.setIcon(icone);

        // Adiciona o botão ao JFrame
        frame.add(botao);

        // Exibe o JFrame
        frame.setVisible(true);
    }
}
