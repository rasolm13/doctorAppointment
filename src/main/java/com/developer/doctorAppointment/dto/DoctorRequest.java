package com.developer.doctorAppointment.dto;

import com.developer.doctorAppointment.utility.MessageConstant;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequest {

    private Integer id;
    @NotEmpty(message = MessageConstant.NOT_EMPTY)
    private String name;
    private String family;
    private String mobileNo;


}
