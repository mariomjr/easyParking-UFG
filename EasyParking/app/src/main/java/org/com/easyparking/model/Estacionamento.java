package org.com.easyparking.model;

import java.util.List;

/**
 * Created by MarioJr on 22/06/2016.
 */
public class Estacionamento {

    private String nome;
    private String cnpj;
    private Double valor;
    private String endereco;
    private List<Tarifa> listTarifas;

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

    public List<Tarifa> getListTarifas() {
        return listTarifas;
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

    public void setListTarifas(List<Tarifa> listTarifas) {
        this.listTarifas = listTarifas;
    }
}
