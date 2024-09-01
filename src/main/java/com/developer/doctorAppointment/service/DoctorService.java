package com.developer.doctorAppointment.service;

import com.developer.doctorAppointment.dto.DoctorRequest;
import com.developer.doctorAppointment.dto.DoctorResponse;
import com.developer.doctorAppointment.exception.ApplicationException;
import com.developer.doctorAppointment.utility.MessageConstant;
import com.developer.doctorAppointment.utility.PublicConstant;
import org.springframework.stereotype.Service;


@Service
public class DoctorService {

    public DoctorResponse save(DoctorRequest request) throws ApplicationException {

        DoctorResponse response = new DoctorResponse();

        if (request.getAge() > 60) {
            throw new ApplicationException(MessageConstant.DOCTOR_NOT_ALLOWED, PublicConstant.DOCTOR_NOT_ALLOWED_ERROR_CODE);
        }

        response.setId(2);

        return response;

    }
}
