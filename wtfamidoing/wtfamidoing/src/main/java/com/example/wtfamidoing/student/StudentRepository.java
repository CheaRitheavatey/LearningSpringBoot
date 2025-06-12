package com.example.wtfamidoing.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // responsible for data access
public interface StudentRepository extends JpaRepository<Student,Long> {

    // SELECT * FROM student WHERE email =?
    Optional<Student> findStudentByEmail(String email);
}
