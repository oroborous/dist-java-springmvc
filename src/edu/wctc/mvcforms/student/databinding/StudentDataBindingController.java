package edu.wctc.mvcforms.student.databinding;

import edu.wctc.mvcforms.Student;
import edu.wctc.mvcforms.Student2;
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
        return "student/databinding/student-form-binding";
    }

    @RequestMapping("/processForm")
    public String processDataBindingForm(@ModelAttribute("bindingStudent") Student theStudent) {
        // Some output just to prove that Spring populated the Student object
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        return "student/databinding/student-confirmation-binding";
    }

    @RequestMapping("/formBinding2")
    public String showFormBinding2(Model model) {
        // create a student object
        Student2 theStudent = new Student2();

        // add student object to the model
        model.addAttribute("bindingStudent", theStudent);

        // return name of view template
        return "student/student-form-binding2";
    }

    @RequestMapping("/processBinding2")
    public String processFormWithBinding2(@ModelAttribute("bindingStudent") Student2 theStudent) {
        // Some output to prove that Spring populated the Student2 object
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        System.out.println(theStudent.getCountry());
        return "student/student-confirmation-binding2";
    }
}
