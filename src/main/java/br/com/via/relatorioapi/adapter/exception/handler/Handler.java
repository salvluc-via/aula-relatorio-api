package br.com.via.relatorioapi.adapter.exception.handler;

import br.com.via.relatorioapi.adapter.exception.DataNotFoundException;
import br.com.via.relatorioapi.adapter.exception.DatabaseException;
import br.com.via.relatorioapi.adapter.exception.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class Handler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<ErrorMessage> databaseExceptionHandler(DatabaseException e) {
        return new ResponseEntity<ErrorMessage>(new ErrorMessage(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ErrorMessage> dataNotFoundExceptionHandler(DataNotFoundException e) {
        return new ResponseEntity<ErrorMessage>(new ErrorMessage("Data no found for id: " + e.getMessage()), HttpStatus.NOT_FOUND);
    }
}

