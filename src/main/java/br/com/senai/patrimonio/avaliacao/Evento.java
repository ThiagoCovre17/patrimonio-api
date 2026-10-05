package br.com.senai.patrimonio.avaliacao;

public class Evento {
    private int codigo;
    private String nome;
    private String local;
    private Participante responsavel;

public  Evento(){}
    public Evento(int codigo, String nome, String local, Participante responsavel) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.responsavel = responsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Participante getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Participante responsavel) {
        this.responsavel = responsavel;
    }


}
