package com.example.sampleProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;


    private String name;
    private String address;
    private String email;
    private String phoneNo;

    private boolean IsActive;
    private String CreatedBy;
    private LocalDateTime createDate;
    private String updatedBy;
    private LocalDateTime updateTime;
}
