package org.com.easyparking.model;

/**
 * Created by MarioJr on 22/06/2016.
 */
public class Estacionamento {

    private String nome;
    private String cnpj;
    private Double valor;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Double getValor() {
        return valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
