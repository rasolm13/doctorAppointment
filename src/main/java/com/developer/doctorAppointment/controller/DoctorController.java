package com.developer.doctorAppointment.controller;

import com.developer.doctorAppointment.dto.DoctorRequest;
import com.developer.doctorAppointment.dto.DoctorResponse;
import com.developer.doctorAppointment.exception.ApplicationException;
import com.developer.doctorAppointment.service.DoctorService;
import com.developer.doctorAppointment.utility.CheckValidation;
import com.developer.doctorAppointment.utility.MessageConstant;
import com.developer.doctorAppointment.utility.PublicConstant;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@Tag(name = "Doctor Web Service", description = "Operations pertaining to doctor services")
@RestController
@RequestMapping("/api/v1/doctor")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService service;

    @Operation(summary = "save doctor")
    @PostMapping()
    public DoctorResponse save(@RequestBody DoctorRequest request) throws Exception {

        //check validation
        String message = CheckValidation.checkObjectValidation(request);

        if (!message.equals(""))
            throw new ApplicationException(message, PublicConstant.VALIDATION_ERROR_CODE);

        if (!CheckValidation.isValidMobileNo(request.getMobileNo()))
            throw new ApplicationException(MessageConstant.NOT_MOBILE_NO, PublicConstant.VALIDATION_ERROR_CODE);

        return service.save(request);

    }


//    @GetMapping(path = "{doctorId}")
//    public DoctorResponse getDoctor(@PathVariable("doctorId") Integer id){
//
//        return service.getDoctor(id);
//
//    }


}
