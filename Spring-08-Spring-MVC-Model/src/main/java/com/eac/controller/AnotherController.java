package com.eac.controller;

import com.eac.enums.Gender;
import com.eac.model.Mentor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class AnotherController {

    @RequestMapping("list")
    public String mentorPage(Model model){

        List<Mentor> mentorList  = new ArrayList<>();
        mentorList.add(new Mentor("James","Miller", Gender.FEMALE,5));
        mentorList.add(new Mentor("Bates","Medina",Gender.MALE,9));
        mentorList.add(new Mentor("Geremi","Collin",Gender.MALE,7));
        mentorList.add(new Mentor("Bimm","Madis",Gender.MALE,11));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";
    }
}
