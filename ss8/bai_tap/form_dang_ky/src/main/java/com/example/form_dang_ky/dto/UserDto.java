package com.example.form_dang_ky.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserDto implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
