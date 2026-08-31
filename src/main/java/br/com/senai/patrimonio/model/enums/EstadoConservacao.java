package br.com.senai.patrimonio.model.enums;

public enum EstadoConservacao {
    NOVO("Novo", 0.05),
    BOM("Bom", 0.10),
    REGULAR("Regular", 0.20),
    RUIM("Ruim", 0.35),
    INSERVIVEL("Inservivel",0.50);

    private final String descricao;
    private final double taxaDEpreciacaoAnual;

    EstadoConservacao (String descricao, double taxaDEpreciacaoAnual) {
        this.descricao = descricao;
        this.taxaDEpreciacaoAnual = taxaDEpreciacaoAnual;

    }

    public String getDescricao() {
        return descricao;
    }

    public double getTaxaDEpreciacaoAnual() {
        return taxaDEpreciacaoAnual;
    }
}
