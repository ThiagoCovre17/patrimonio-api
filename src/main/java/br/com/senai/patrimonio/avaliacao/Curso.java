package br.com.senai.patrimonio.avaliacao;

public class Curso {
    private int cargaHoraria;
    private String instrutor;
    private int quantidadeDeVagas;

    public Curso(){}
    public Curso(int cargaHoraria, String instrutor, int quantidadeDeVagas) {
        this.cargaHoraria = cargaHoraria;
        this.instrutor = instrutor;
        this.quantidadeDeVagas = quantidadeDeVagas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public int getQuantidadeDeVagas() {
        return quantidadeDeVagas;
    }

    public void setQuantidadeDeVagas(int quantidadeDeVagas) {
        this.quantidadeDeVagas = quantidadeDeVagas;
    }
}
