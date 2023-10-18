package com.dailycode.sbrdemo.service;

import com.dailycode.sbrdemo.model.Student;

import java.util.List;

public interface IStudentService {

    Student addStudent(Student student);

    List<Student> getStudents();

    Student updateStudent(Student student,Long id);

    Student getStudentById(Long Id);

    void deleteStudent(Long id);
}
