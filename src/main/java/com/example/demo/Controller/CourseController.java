package com.example.demo.Controller;

import com.example.demo.Models.Course;
import com.example.demo.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/create")
    public String create (Model model)
    {
        model.addAttribute("course",new Course());
        return "create";
    }
    @PostMapping("/create")
    public String create (Course newCourse, Model model)
    {
        courseService.add(newCourse);
        return "redirect:/home";
    }



}
