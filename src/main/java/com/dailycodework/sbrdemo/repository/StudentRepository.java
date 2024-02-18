package com.dailycodework.sbrdemo.repository;

import com.dailycodework.sbrdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

//    Optional<Student> findByEmail(String email);
}
