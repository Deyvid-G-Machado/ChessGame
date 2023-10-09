package org.tekyoh.models;

public class Peca {
    // Atributos
    private final String nome;
    private Character notacaoAlgebrica;
    private Player jogador;

    // Construtor com menos parâmetros
    public Peca(String nome, Character notacaoAlgebrica) {
        this.nome = nome;
        this.notacaoAlgebrica = notacaoAlgebrica;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public Character getNotacaoAlgebrica() {
        return notacaoAlgebrica;
    }

    public void setNotacaoAlgebrica(Character notacaoAlgebrica) {
        this.notacaoAlgebrica = notacaoAlgebrica;
    }

    public Player getJogador() {
        return jogador;
    }

    public void setJogador(Player jogador) {
        this.jogador = jogador;
    }

    // toString
    @Override
    public String toString() {
        return notacaoAlgebrica + " [" + jogador.getNome() + "]" + " | ";
    }
}