package com.exchange.controller.handler;

import com.exchange.controller.response.Response;
import com.exchange.exception.InternalServerException;
import com.exchange.exception.ValidationException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/**
 * The type Rest error handler.
 */
@RestControllerAdvice
public class RestErrorHandler {

    /**
     * Handle data access exception response.
     *
     * @param ex the ex
     * @return the response
     */
    @ExceptionHandler(DataAccessException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response handleDataAccessException(final DataAccessException ex) {
        Response response = new Response();
        response.setMessage(Collections.singletonList(ex.getMessage()));
        return response;
    }

    /**
     * Handle validation exception response.
     *
     * @param ex the ex
     * @return the response
     */
    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response handleValidationException(final ValidationException ex) {
        Response response = new Response();
        response.setMessage(Collections.singletonList(ex.getMessage()));
        return response;
    }

    /**
     * Handle internal server exception response.
     *
     * @param ex the ex
     * @return the response
     */
    @ExceptionHandler(InternalServerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response handleInternalServerException(final InternalServerException ex) {
        Response response = new Response();
        response.setMessage(Collections.singletonList(ex.getMessage()));
        return response;
    }

    /**
     * Handle file not found exception response.
     *
     * @param ex the ex
     * @return the response
     */
    @ExceptionHandler(FileNotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response handleFileNotFoundException(final FileNotFoundException ex) {
        Response response = new Response();
        response.setMessage(Collections.singletonList(ex.getMessage()));
        return response;
    }

    /**
     * Handle file not found exception response.
     *
     * @param ex the ex
     * @return the response
     */
    @ExceptionHandler(IOException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response handleFileNotFoundException(final IOException ex) {
        Response response = new Response();
        response.setMessage(Collections.singletonList(ex.getMessage()));
        return response;
    }

    /**
     * Handle exception response.
     *
     * @param ex the ex
     * @return the response
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response handleException(final Exception ex) {
        Response response = new Response();
        response.setMessage(Collections.singletonList(ex.getMessage()));
        return response;
    }


}
