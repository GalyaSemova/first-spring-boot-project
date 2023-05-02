package com.company.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Galya",
                        "Semova",
                        LocalDate.now(),
                        "test@gmail.com",
                        35
                ),
                new Student(
                        "Galina",
                        "Student 2",
                        LocalDate.now(),
                        "test2@gmail.com",
                        24
                )

        );
    }
}
