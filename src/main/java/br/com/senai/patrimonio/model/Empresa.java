package br.com.senai.patrimonio.model;

import jakarta.persistence.Embedded;

public class Empresa {
    private Long id;
    private String nome;
    private String razaoSocial;
    private String cpmj;
    private String contato;
    private String unidade;

    @Embedded
    private Endereco endereco;

    public Empresa(){}

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpmj() {
        return cpmj;
    }

    public void setCpmj(String cpmj) {
        this.cpmj = cpmj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
