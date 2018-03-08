package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    StudentDao studentDao;

    @PostMapping("/login")
    public String login(Model model, Student student) {
        Student studentByStudent = studentDao.findStudentByStudent(student);
        if (studentByStudent == null) {
            return "no";
        } else {
            model.addAttribute("student",studentByStudent);
            return "ok";
        }

    }

    @GetMapping("/")
    public String goToLogin() {
        return "login";
    }
}
