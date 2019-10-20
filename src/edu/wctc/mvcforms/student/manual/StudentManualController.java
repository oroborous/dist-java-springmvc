package edu.wctc.mvcforms.student.manual;

import edu.wctc.mvcforms.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student/manual")
public class StudentManualController {
    @RequestMapping("/showForm")
    public String showManualForm() {
        return "student/manual/student-form-manual";
    }

    @RequestMapping("/processForm")
    public String processManualForm(HttpServletRequest request, Model model) {
        // create the Student object manually
        Student studentObj = new Student();

        // populate it manually using the request params
        studentObj.setFirstName(request.getParameter("firstName"));
        studentObj.setLastName(request.getParameter("lastName"));

        // add it to the model manually
        model.addAttribute("manualStudent", studentObj);

        // return name of view template
        return "student/manual/student-confirmation-manual";
    }
}
