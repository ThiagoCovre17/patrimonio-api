package br.com.senai.patrimonio.atividade2;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularBonificacao() {
        return getSalarioBase() * 0.15;
    }
}
