package com.example.sampleProject.service;

import com.example.sampleProject.dto.AddStudentRequestDto;
import com.example.sampleProject.model.StudentModel;
import com.example.sampleProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public String addStudentInfo( AddStudentRequestDto addStudentRequestDto){

        StudentModel studentModel = new StudentModel();
        studentModel.setName(addStudentRequestDto.getName());
        studentModel.setEmail(addStudentRequestDto.getEmail());
        studentModel.setAddress(addStudentRequestDto.getAddress());
        studentModel.setPhoneNo(addStudentRequestDto.getPhoneNo());
        studentModel.setCreatedBy(addStudentRequestDto.getCreatedBy());
        studentModel.setCreateDate(LocalDateTime.now());
        studentModel.setIsActive(true);
        studentRepository.save(studentModel);
        return "Student added successfully";
    }
}
