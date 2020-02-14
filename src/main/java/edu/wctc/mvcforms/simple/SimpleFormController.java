package edu.wctc.mvcforms.simple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SimpleFormController {
    // method to show the initial HTML form
    // URL is case sensitive!
    @RequestMapping("/showForm")
    public String showForm() {
        // Returns name of view
        // Prefix and suffix are appended
        // (So it becomes /WEB-INF/view/simple-form.jsp)
        return "simple/simple-form";
    }

    // method to read form data and add it to the model
    // The Model class is part of Spring
    @RequestMapping("/shout")
    public String shout(HttpServletRequest request, Model model) {
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
        // (So it becomes /WEB-INF/view/simple-form-result.jsp)
        return "simple/simple-form-result";
    }

    @RequestMapping("/shoutAgain")
    public String shoutWithAnnotation(
            @RequestParam("studentName") String theName,
            Model model) {
        // Does the same thing as shout() above, but Spring will read
        // the form param "studentName" from the HttpServletRequest
        // and assign it to the method param theName automatically

        // Create the message
        String message = "Hello again, " + theName.toUpperCase() + "!!!!";

        // Add message to model
        // "msg" is the key, message contains the value
        // The value can be any data type, not just Strings!
        model.addAttribute("msg", message);

        // Returns name of view
        // Prefix and suffix are appended
        // (So it becomes /WEB-INF/view/simple-form-result.jsp)
        return "simple/simple-form-result";
    }
}
