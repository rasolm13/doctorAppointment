package com.developer.doctorAppointment.exception;

import com.developer.doctorAppointment.utility.MessageConstant;
import com.developer.doctorAppointment.utility.PublicConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<?> applicationException(ApplicationException e) {

        ErrorDetails errorDetails = new ErrorDetails(e.getErrorCode(), e.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.OK);

    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globalException(Exception e) {

        ErrorDetails errorDetails = new ErrorDetails(PublicConstant.SYSTEM_ERROR_CODE, MessageConstant.SYSTEM_ERROR_CODE);
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
