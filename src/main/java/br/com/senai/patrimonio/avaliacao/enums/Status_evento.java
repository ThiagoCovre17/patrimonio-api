package br.com.senai.patrimonio.avaliacao.enums;

public enum Status_evento {
    EVENTO_PLANEJADO("Evento planejado", 10),
    INSCRICOES_ABERTOS("Inscriçoes abertos", 20),
    EVENTO_EM_ANDAMENTO("Evento em andamento", 30),
    EVENTO_ENCERRADO("Evento encerrado", 40),
    EVENTO_CANCELADO("Evento cancelado", 50);

    private final String descricao;
    private final double codigo_numerico;

    public String getDescricao() {
        return descricao;
    }

    public double getCodigo_numerico() {
        return codigo_numerico;
    }

    Status_evento(String descricao, double codigo_numerico) {
        this.descricao = descricao;
        this.codigo_numerico = codigo_numerico;


    }

    public String getdescricao() {
    return descricao;
    }
    public double getcodigo_numerico(){
        return codigo_numerico;
    }
}
