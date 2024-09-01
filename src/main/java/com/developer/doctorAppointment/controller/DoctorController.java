package com.developer.doctorAppointment.controller;

import com.developer.doctorAppointment.dto.DoctorRequest;
import com.developer.doctorAppointment.dto.DoctorResponse;
import com.developer.doctorAppointment.service.DoctorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Doctor Web Service", description = "Operations pertaining to doctor services")
@RestController
@RequestMapping("/api/v1/doctor")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService service;

    @Operation(summary = "save doctor")
    @PostMapping()
    public DoctorResponse save(@RequestBody DoctorRequest request) throws Exception {

        return service.save(request);

    }


}
