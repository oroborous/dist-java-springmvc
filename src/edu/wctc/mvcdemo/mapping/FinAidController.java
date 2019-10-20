package edu.wctc.mvcdemo.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finaid")
public class FinAidController {
    @RequestMapping("/home")
    public String showHomePage() {
        return "mapping/fin-aid";
    }
}


