package com.developer.doctorAppointment.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDetails {

    private Integer responseCode;
    private String responseMessage;

}
