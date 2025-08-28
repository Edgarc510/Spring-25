package com.eac.controller;

import com.eac.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "EAC");
        model.addAttribute("course", "Developer");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        //create randome studentID and show it int your UI
        int studentId = getRandomNumber();
        model.addAttribute("id",studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);
        model.addAttribute("numbers",numbers);

        Student student = new Student(101,"dfefef","dfsfdsf");
        model.addAttribute("student",student);




        return "/student/welcome";
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(1001); // 1001 because upper bound is exclusive
    }



}
