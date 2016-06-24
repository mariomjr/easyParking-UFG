package org.com.easyparking.model;

/**
 * Created by MarioJr on 22/06/2016.
 */
public class Tarifa {

    private String tipoVeiculo;

    private Double valorTarifaHora;

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public Double getValorTarifaHora() {
        return valorTarifaHora;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setValorTarifaHora(Double valorTarifaHora) {
        this.valorTarifaHora = valorTarifaHora;
    }
}
