package com.aws.project.controller;

import com.aws.project.entity.Student;
import com.aws.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id){
        Student student = this.studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping("student")
    public ResponseEntity<String> getStudent(@RequestBody Student student){
        this.studentService.addStudent(student);
        return ResponseEntity.ok("Student created Successfully");
    }
}
