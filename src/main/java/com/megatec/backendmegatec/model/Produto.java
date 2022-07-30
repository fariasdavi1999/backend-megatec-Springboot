package com.megatec.backendmegatec.model;

public class Produto {

    // #region atributos

    private Integer id;

    private String nome;

    private Integer quantidade;

    private Double valor;

    private String obs;

    // #endregion atributos

    // #region get and set

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public String getObs() {
        return obs;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    // #endregion get and set

}