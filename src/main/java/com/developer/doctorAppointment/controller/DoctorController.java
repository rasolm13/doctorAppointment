package com.developer.doctorAppointment.controller;

import com.developer.doctorAppointment.dto.DoctorRequest;
import com.developer.doctorAppointment.dto.DoctorResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Doctor Web Service", description = "Operations pertaining to doctor services")
@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {

    @Operation(summary = "save doctor")
    @PostMapping()
    public DoctorResponse save(@RequestBody DoctorRequest request){

        DoctorResponse response = DoctorResponse.builder()
                .id(2)
                .build();

        return response;

    }
}
