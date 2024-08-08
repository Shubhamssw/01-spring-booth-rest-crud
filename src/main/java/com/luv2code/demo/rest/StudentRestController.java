package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;
    @PostConstruct
    public void loadData() {
        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Wadekar", "Shubham"));
        theStudents.add(new Student("Rajput", "Madhurika"));
        theStudents.add(new Student("Patel", "Poornima"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {



        return theStudents;
    }
}




