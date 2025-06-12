package com.example.wtfamidoing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class TestController {

    @GetMapping("allQuestions")
    public String getAllQuestion () {
        return "Hi, These are your questions";
    }


}
