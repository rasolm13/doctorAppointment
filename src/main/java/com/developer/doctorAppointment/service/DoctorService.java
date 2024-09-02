package com.developer.doctorAppointment.service;

import com.developer.doctorAppointment.dto.DoctorRequest;
import com.developer.doctorAppointment.dto.DoctorResponse;
import com.developer.doctorAppointment.entity.Doctor;
import com.developer.doctorAppointment.exception.ApplicationException;
import com.developer.doctorAppointment.repositry.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository repository;

    public DoctorResponse save(DoctorRequest request) throws ApplicationException {

        DoctorResponse response = new DoctorResponse();

        Doctor doctor = Doctor.builder()
                .name(request.getName())
                .family(request.getFamily())
                .mobileNo(request.getMobileNo())
                .build();

        doctor = repository.save(doctor);

        response.setId(doctor.getId());

        return response;

    }

//    public DoctorResponse getDoctor(Integer id) {
//
//        DoctorResponse response = new DoctorResponse();
//
//        Optional<Doctor> doctor = repository.findById(id);
//
//        response.setId();
//
//        return
//
//
//    }
}
