package org.tekyoh.models;

public class Player {
    // Atributos
    private String nome;
    private Integer pontuacao = 0;
    private Character corPeca;

    // Construtor
    public Player(String nome, char corPeca) {
        this.nome = nome;
        this.corPeca = corPeca;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Character getCorPeca() {
        return corPeca;
    }

    public void setCorPeca(Character corPeca) {
        this.corPeca = corPeca;
    }

    // toString
    @Override
    public String toString() {
        return "Player{" +
                "nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                ", corPeca=" + corPeca +
                '}';
    }
}
