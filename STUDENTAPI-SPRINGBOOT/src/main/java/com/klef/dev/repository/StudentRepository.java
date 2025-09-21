package com.klef.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.klef.dev.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> 
{
    Student findByEmail(String email);
    Student findByContact(String contact);
}
