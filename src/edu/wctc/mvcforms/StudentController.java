package edu.wctc.mvcforms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/")
    public String showHomePage() {
        return "student/index";
    }

    @RequestMapping("/formManual")
    public String showFormManual() {
        return "student/student-form-manual";
    }

    @RequestMapping("/processManual")
    public String processFormManually(HttpServletRequest request, Model model) {
        // create the Student object manually
        Student studentObj = new Student();

        // populate it manually using the request params
        studentObj.setFirstName(request.getParameter("firstName"));
        studentObj.setLastName(request.getParameter("lastName"));

        // add it to the model manually
        model.addAttribute("manualStudent", studentObj);

        // return name of view template
        return "student/student-confirmation-manual";
    }

    @RequestMapping("/formBinding")
    public String showFormBinding(Model model) {
        // create a student object
        Student theStudent = new Student();

        // add student object to the model
        model.addAttribute("bindingStudent", theStudent);

        // return name of view template
        return "student/student-form-binding";
    }

    @RequestMapping("/processBinding")
    public String processFormWithBinding(@ModelAttribute("bindingStudent") Student theStudent) {
        // Some output to prove that Spring populated the Student object
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        return "student/student-confirmation-binding";
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
