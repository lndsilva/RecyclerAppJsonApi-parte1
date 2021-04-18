package br.com.local.recyclerappjsonapi;

public class ListarItens {
    private String cabecalho;
    private String descricao;

    public ListarItens(String cabecalho, String descricao) {
        this.cabecalho = cabecalho;
        this.descricao = descricao;
    }

    public String getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
