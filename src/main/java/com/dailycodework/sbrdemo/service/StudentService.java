package com.dailycodework.sbrdemo.service;

import com.dailycodework.sbrdemo.model.Student;
import com.dailycodework.sbrdemo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentService implements  IStudentService{
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    
    @Override
    public Student addStudent(Student student) {
//        if (studentAlreadyExists(student.getEmail())){
//            throw new StudentAlreadyExistsException(student.getEmail() + " already exists!");
//        }
//        return studentRepository.save(student);
        return null;
    }



    @Override
    public Student updateStudent(Student student, Long id) {
        return null;
    }

    @Override
    public Student getStudentId(Long id) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
//    private boolean studentAlreadyExists(String email) {
//        return studentRepository.findByEmail(email).isPresent();
//    }
    
}
