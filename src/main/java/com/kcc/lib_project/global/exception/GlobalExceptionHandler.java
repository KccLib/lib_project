package com.kcc.lib_project.global.exception;

import com.kcc.lib_project.global.exception.type.BadRequestException;
import com.kcc.lib_project.global.exception.type.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    //추후 error 페이지 생성

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<?> handle(Exception ex) {
//        return ResponseEntity
//                .status(HttpStatus.INTERNAL_SERVER_ERROR)
//                .body(ex.getMessage());
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<?> handle(MethodArgumentNotValidException ex) {
//        return ResponseEntity
//                .status(HttpStatus.BAD_REQUEST)
//                .body(ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
//    }
//
//    @ExceptionHandler(NotFoundException.class)
//    public ResponseEntity<?> handle(NotFoundException ex) {
//
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body(ex.getMessage());
//    }
//
//    @ExceptionHandler(BadRequestException.class)
//    public ResponseEntity<?> handle(BadRequestException ex) {
//        return ResponseEntity
//                .status(HttpStatus.BAD_REQUEST)
//                .body(ex.getMessage());
//    }

}
