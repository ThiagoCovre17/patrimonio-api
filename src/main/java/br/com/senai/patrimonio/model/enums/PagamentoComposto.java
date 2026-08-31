package br.com.senai.patrimonio.model.enums;

public enum PagamentoComposto {
    PIX("Pix", "ativo"),
    CARTAO_CREDITO("Cartao_Credito", "ativo"),
    CARTAO_DEBITO("Cartao_Credito", "ativo"),
    BOLETO("Boleto", "Inativo"),
    PERMUTA("Permuta", "inatativo"),
    DINHEIRO("Dinheiro", "Ativo");

    private final String descricao;
    private final String situacao;


    public String getDescricao() {
        return descricao;
    }

    public String getSituacao() {
        return situacao;
    }



    PagamentoComposto(String descricao, String situacao) {
        this.descricao = descricao;
        this.situacao = situacao;

    }
}


