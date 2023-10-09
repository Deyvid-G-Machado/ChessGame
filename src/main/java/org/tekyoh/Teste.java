package org.tekyoh;

public class Teste {
    public static void main(String[] args) {
        String[][] tabuleiro = new String[8][8];

        //Peças pretas
        tabuleiro[0][0] = "T";
        tabuleiro[0][1] = "C";
        tabuleiro[0][2] = "B";
        tabuleiro[0][3] = "D";
        tabuleiro[0][4] = "R";
        tabuleiro[0][5] = "B";
        tabuleiro[0][6] = "C";
        tabuleiro[0][7] = "T";

        tabuleiro[1][0] = "P";
        tabuleiro[1][1] = "P";
        tabuleiro[1][2] = "P";
        tabuleiro[1][3] = "P";
        tabuleiro[1][4] = "P";
        tabuleiro[1][5] = "P";
        tabuleiro[1][6] = "P";
        tabuleiro[1][7] = "P";


        // Peças brancas
        tabuleiro[6][0] = "P";
        tabuleiro[6][1] = "P";
        tabuleiro[6][2] = "P";
        tabuleiro[6][3] = "P";
        tabuleiro[6][4] = "P";
        tabuleiro[6][5] = "P";
        tabuleiro[6][6] = "P";
        tabuleiro[6][7] = "P";

        tabuleiro[7][0] = "T";
        tabuleiro[7][1] = "C";
        tabuleiro[7][2] = "B";
        tabuleiro[7][3] = "D";
        tabuleiro[7][4] = "R";
        tabuleiro[7][5] = "B";
        tabuleiro[7][6] = "C";
        tabuleiro[7][7] = "T";

        String tabuleiroMontado = "";
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j <= 7; j++) {
                tabuleiroMontado += tabuleiro[i][j] + " ";
            }
            tabuleiroMontado += "\n";
        }
        System.out.println(tabuleiroMontado);
    }
}
