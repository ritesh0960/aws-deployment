package com.aws.project.service;

import com.aws.project.entity.Student;
import com.aws.project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){
        this.studentRepository.save(student);
    }

    public Student getStudentById(int id){
        return  this.studentRepository.getReferenceById(id);
    }
}
