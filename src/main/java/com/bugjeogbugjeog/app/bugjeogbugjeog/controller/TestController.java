package com.bugjeogbugjeog.app.bugjeogbugjeog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage/*")
/*@RequestMapping("/main/*")*/
public class TestController {

    @GetMapping("/profile/exit")
    public String main(){
        return "mypage/profile/myinfo";
    }

/*    @GetMapping("/main")
    public void main(){
    }*/
}
