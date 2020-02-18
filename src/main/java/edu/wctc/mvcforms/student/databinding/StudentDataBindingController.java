package edu.wctc.mvcforms.student.databinding;

import edu.wctc.mvcforms.student.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student/databinding")
public class StudentDataBindingController {
    @RequestMapping("/showForm")
    public String showDataBindingForm(Model model) {
        // create a student object
        Student theStudent = new Student();

        // add student object to the model
        model.addAttribute("bindingStudent", theStudent);

        // return name of view template
        return "student/databinding/form";
    }

    @RequestMapping("/processForm")
    public String processDataBindingForm(@ModelAttribute("bindingStudent") Student theStudent) {
        // Some output just to prove that Spring populated the Student object
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        return "student/databinding/confirmation";
    }
}
