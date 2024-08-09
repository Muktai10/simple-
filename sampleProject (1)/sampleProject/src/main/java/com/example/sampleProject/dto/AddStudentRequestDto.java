package com.example.sampleProject.dto;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class AddStudentRequestDto {

    private String name;
    private String address;
    private String email;
    private String phoneNo;
    private String CreatedBy;
}
