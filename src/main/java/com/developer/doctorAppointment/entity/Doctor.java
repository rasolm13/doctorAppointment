package com.developer.doctorAppointment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "doctor_tbl")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name_doctor")
    private String name;

    @Column(name = "family_doctor")
    private String family;

    @Column(name = "mobile_doctor")
    private String mobileNo;

}
