package com.goanna.Repository;


import com.goanna.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {

    int insertStudent(Student student);

    List<Student> getAllStudents();

    Student SelectById(int id);



}
