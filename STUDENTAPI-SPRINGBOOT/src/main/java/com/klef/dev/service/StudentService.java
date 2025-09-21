package com.klef.dev.service;

import java.util.List;
import com.klef.dev.entity.Student;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student updateStudent(Student student);
    void deleteStudentById(int id);
}
