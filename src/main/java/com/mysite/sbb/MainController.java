package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody // 리턴 값이 응답의 본문 (고객이 볼 수 있는게 return);
    public int home(){
        System.out.println("Home");
        return 22;
    }

    @GetMapping("/about")
    @ResponseBody
    public void about(){
        System.out.println("about");
        this.contact();
    }

    public void contact(){
        System.out.println("contact");
    }

}
