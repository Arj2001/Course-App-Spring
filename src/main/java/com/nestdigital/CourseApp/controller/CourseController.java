package com.nestdigital.CourseApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/")
    public String home(){
        return "Welcome to home page";
    }

    @PostMapping("/read")
    public String readValue(){
        return "This is a post method";
    }

    @GetMapping("/viewall")
    public List viewAll(){
        List<String> myList = new ArrayList<>();
        myList.add("{'name':'Varun','age':22}");
        myList.add("{'name':'Jonthan','age':26}");
        return myList;
    }

    @GetMapping("/student")
    public String student(){
        return "Adarsh";
    }

}
