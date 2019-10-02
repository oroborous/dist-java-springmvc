package edu.wctc.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    // method to show the initial HTML form
    // URL is case sensitive!
    @RequestMapping("/showForm")
    public String showForm() {
        // Returns name of view
        // Prefix and suffix are appended
        // (So it becomes /WEB-INF/view/helloworld-form.jsp)
        return "helloworld-form";
    }

    // method to process the form and show confirmation
    @RequestMapping("/processForm")
    public String processForm() {
        // Returns name of view
        // Prefix and suffix are appended
        // (So it becomes /WEB-INF/view/helloworld.jsp)
        return "helloworld";
    }

    // method to read form data and add it to the model
    // The Model class is part of Spring
    @RequestMapping("/shoutHello")
    public String shout(HttpServletRequest request, Model model){
        // Read request parameter that came from form
        String theName = request.getParameter("studentName");

        // Convert data to uppercase
        theName = theName.toUpperCase();

        // Create the message
        String message = "Hello, " + theName + "!!!!";

        // Add message to model
        // "msg" is the key, message contains the value
        // The value can be any data type, not just Strings!
        model.addAttribute("msg", message);

        // Returns name of view
        // Prefix and suffix are appended
        // (So it becomes /WEB-INF/view/helloworld.jsp)
        return "helloworld";
    }
}
