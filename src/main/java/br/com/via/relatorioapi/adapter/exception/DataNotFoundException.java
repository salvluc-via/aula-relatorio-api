package br.com.via.relatorioapi.adapter.exception;

public class DataNotFoundException extends Exception {
    public DataNotFoundException(int id) {
        super(String.valueOf(id));
    }

}
