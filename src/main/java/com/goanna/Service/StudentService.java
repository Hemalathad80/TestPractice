package com.goanna.Service;

import com.goanna.Entity.Student;
import com.goanna.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public int addStudent(Student student){
        return studentRepository.insertStudent(student);
    }

    public List<Student> findAllStudents(){
        return studentRepository.getAllStudents();
    }

    public Student getStudentsByID(int id){
        return studentRepository.SelectById(id);
    }
}
