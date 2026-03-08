package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public void home(){
        System.out.println("Home");
        this.contact();
    }

    @GetMapping("/about")
    public void about(){
        System.out.println("about");
        this.contact();
    }

    public void contact(){
        System.out.println("contact");
    }

}
