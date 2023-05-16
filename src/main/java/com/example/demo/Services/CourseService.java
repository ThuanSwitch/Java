package com.example.demo.Services;

import com.example.demo.Models.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private List<Course> listCourse = new ArrayList<>();
    public  void add(Course newProduct )
    {
        listCourse.add(newProduct);
    }
    public List<Course> GetALl() {
        return listCourse;
    }

}
