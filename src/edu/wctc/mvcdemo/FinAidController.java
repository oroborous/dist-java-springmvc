package edu.wctc.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finAid")
public class FinAidController {
    @RequestMapping("/home")
    public String showHomePage() {
        return "fin-aid";
    }
}


