package com.senai.travel_management.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ViagemDto {

    @NotBlank
    private String destino;

    @NotNull
    private String data;

    private String status;

    private String emailViajente;

    public ViagemDto() {
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmailViajente() {
        return emailViajente;
    }

    public void setEmailViajente(String emailViajente) {
        this.emailViajente = emailViajente;
    }
}
