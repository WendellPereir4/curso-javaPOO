package model;

import Utils.DataUtil;

import java.util.Date;

public class Movimentacao {
    private String descricao;
    private Date data;
    private Double valor;

    public Movimentacao(String descricao, Double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }


    public Double getValor() {
        return valor;
    }

    @Override // é uma anotação.
    public String toString(){
        String dataformatada = DataUtil.converterDateParaDataEHora(this.getData());
        return this.getDescricao() + "\n" + dataformatada + " - R$" + valor;

        //Descrição
        //Data e hora
    }

}
