package br.com.senai.patrimonio.atividades;

public class Computadores extends Equipamento{

    private String nome;
    private double valorInicial;



    public Computadores(String nome, double valorInicial ) {
        super(nome, valorInicial);
        this.nome = nome;
        this.valorInicial = valorInicial;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValorInicial() {
        return valorInicial;
    }

    @Override
    public double calcularDepreciacao() {
        return getValorInicial()* 0.20;
    }
}

