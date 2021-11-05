package br.com.via.relatorioapi.adapter.exception.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessage {

    @JsonProperty("error_message")
    public String errorMessage;

    @JsonProperty("error_code")
    public String errorCode;

    public ErrorMessage(String message) {
        this.errorMessage = message;
    }
}
