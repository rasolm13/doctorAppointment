package com.developer.doctorAppointment.exception;

import lombok.Data;

@Data
public class ApplicationException extends Exception{
    Integer errorCode;

    public ApplicationException(String message, Integer errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
