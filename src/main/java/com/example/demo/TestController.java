package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AFeng
 * @date 2020/4/3 14:05
 */
@RestController
@RequestMapping("v1")
public class TestController {


    @GetMapping("test")
    public String test(){
        return "2";
    }

}
