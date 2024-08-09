package com.example.sampleProject.controller;

import com.example.sampleProject.dto.AddStudentRequestDto;
import com.example.sampleProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Student")
public class TestController {
     @Autowired
     private StudentService studentService;

    @PostMapping("/ addStudent")

    public String addStudentInfo(@RequestBody AddStudentRequestDto addStudentRequestDto){
        return studentService.addStudentInfo(addStudentRequestDto);
    }
}
