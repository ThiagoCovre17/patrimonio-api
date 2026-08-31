package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.Cargo;

public class Funcionario extends Pessoa {
    private Cargo cargo;
    private  Empresa empresa;
    private Sala salaResponsavel;

    public Funcionario(){};

    public Funcionario(Cargo cargo, Empresa empresa, Sala salaResponsavel) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.salaResponsavel = salaResponsavel;
    }

    public Funcionario(Long id, String nome, String cpf, Cargo cargo, Empresa empresa, Sala salaResponsavel) {
        super(id, nome, cpf);
        this.cargo = cargo;
        this.empresa = empresa;
        this.salaResponsavel = salaResponsavel;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Sala getSalaResponsavel() {
        return salaResponsavel;
    }

    public void setSalaResponsavel(Sala salaResponsavel) {
        this.salaResponsavel = salaResponsavel;
    }
}

