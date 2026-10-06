package br.com.senai.patrimonio.atividade2;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // TODO: Retornar a bonificação padrão de 5% do salário base (salarioBase * 0.05)
    public double calcularBonificacao() {

        return this.getSalarioBase()*0.05;
    }
}

