package com.goanna.Controller;

import com.goanna.Entity.Student;
import com.goanna.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/student")
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public void addNewStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> returnAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping(path = "{id}")
    public Student getPupilByID(@PathVariable("id") int id){
        return studentService.getStudentsByID(id);
    }
}
