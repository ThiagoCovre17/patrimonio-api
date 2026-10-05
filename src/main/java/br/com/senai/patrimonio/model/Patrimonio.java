package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.EstadoConservacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public  class Patrimonio implements BuscarEmpresaVinculada {

    private Long id;
    private Bem bem;
    private Sala sala;
    private Funcionario funcionario;
    private Integer quantidade;
    private EstadoConservacao estado;
    private LocalDate dataAquisicao;
    private BigDecimal valor;

    public Patrimonio() {
    }

    /* alocar este patrimonio em uma sala e garantir que ele sai da responsabilidade
    de um funcionario*/
    public void alocarEmSala(Sala sala){
        this.sala = sala;
        this.funcionario = null;
    }

    /*Aloca este patrimonio sob responsabilidade de um funcionario*/
    public void alocarParaFuncionario(Funcionario funcionario){
        this.funcionario=funcionario;
        this.sala = null;
    }
    /* Retorna true se possuir  uma sala ou um funcionario vinculado ao patrimonio*/
    public  boolean possuiLocalizacaoValida(){
        return (sala!= null) || (funcionario != null);

    }

    public Localizavel getLocalizacaoAtual(){
        return this.sala!=null ? sala : funcionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bem getBem() {
        return bem;
    }

    public void setBem(Bem bem) {
        this.bem = bem;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public EstadoConservacao getEstado() {
        return estado;
    }

    public void setEstado(EstadoConservacao estado) {
        this.estado = estado;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String getEmpresaVinculada() {
        if(getEmpresaVinculada() == null){
            return "Empresa nao informada";
        }
        return "Empres: " +getEmpresaVinculada();






}
}
