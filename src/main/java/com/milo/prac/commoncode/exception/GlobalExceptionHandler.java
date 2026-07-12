package com.milo.prac.commoncode.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GroupCodeNotFoundException.class)
    public ResponseEntity<String> groupCodeNotFoundExceptionHandler(
            GroupCodeNotFoundException e
    ) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(e.getMessage());
    }

    @ExceptionHandler(DuplicateCommentCodeException.class)
    public ResponseEntity<String> duplicateCommentCodeHandler(
            DuplicateCommentCodeException e
    ) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(e.getMessage());
    }

    @ExceptionHandler(CommonCodeNotFoundException.class)
    public ResponseEntity<String> commonCodeNotFoundException(
            CommonCodeNotFoundException e
    ) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(e.getMessage());
    }

}
