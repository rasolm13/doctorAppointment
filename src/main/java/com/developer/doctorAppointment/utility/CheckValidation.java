package com.developer.doctorAppointment.utility;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

public class CheckValidation {

    public static String checkObjectValidation(Object obj){

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> violations = validator.validate(obj);

        for (ConstraintViolation<Object> violation : violations){
            return violation.getMessage();
        }

        return "";

    }

    public static boolean isValidMobileNo(String mobileNo){

        if(mobileNo.length() != 11 || !mobileNo.startsWith("09") || !StringUtils.isNumeric(mobileNo)){
            return false;
        }

        return true;

    }
}
