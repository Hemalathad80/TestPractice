package com.goanna.Repository;

import com.goanna.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeStudentDatabase implements StudentRepository{

    private static List<Student> STUDENTDATA = new ArrayList<>();


    @Override
    public int insertStudent(Student student) {
        STUDENTDATA.add(new Student(student.getId(), student.getName(), student.getAge()));
        return 1;
    }



    @Override
    public List<Student> getAllStudents() {
        return STUDENTDATA;
    }



    @Override
    public Student SelectById(int id) {

        Student found = null;

        for(Student student : STUDENTDATA){
            if(student.getId() == id){
                found = student;
            }
        }

        return found;
    }
}
