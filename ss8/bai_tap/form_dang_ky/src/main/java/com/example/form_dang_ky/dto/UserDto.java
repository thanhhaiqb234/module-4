package com.example.form_dang_ky.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Column;
import javax.validation.constraints.*;

public class UserDto implements Validator {


    private int id;

    @Size(min = 5,max = 45,message = "Độ dài tối thiểu 5,Tối đạ 45")
    private String firstName;

    @Size(min = 5,max = 45,message = "Độ dài tối thiểu 5,Tối đạ 45")
    private String lastName;

    @Pattern(regexp = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$",message = "Nhap Sai Dinh Dang")
    private String phone;

    @Min(value = 18)
    private int year;

    @NotNull
    @Email(message = "Sai định dạng")
    private String email;


    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, String phone, int year, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.year = year;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
