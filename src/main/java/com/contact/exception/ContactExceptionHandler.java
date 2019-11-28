package com.contact.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ContactExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(ContactExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException e) {
        logger.error(e.getMessage(), e);
        return new ResponseEntity<Object>("Argument is incorrect, check argument please!", HttpStatus.OK);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    protected ResponseEntity<Object> handleMissingParameterException(MissingServletRequestParameterException e) {
        logger.error(e.getMessage(), e);
        return new ResponseEntity<Object>("You missed or introduce incorrect parameter nameFilter which is required.", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RuntimeException.class)
    protected ResponseEntity<Object> handleRuntimeException(RuntimeException e) {
        logger.error(e.getMessage(), e);
        return new ResponseEntity<Object>("Some problem was happened during the execution of the request.", HttpStatus.OK);
    }
}
