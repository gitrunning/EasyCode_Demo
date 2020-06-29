package com.ldgroup.easycodedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/6/28 11:54
 **/
@RestController
@RequestMapping("/easycode")
public class EasyCodeController {
    @GetMapping("/test")
    public String test(){
        System.out.println("helllo");
        return "hello test";
    }
}
