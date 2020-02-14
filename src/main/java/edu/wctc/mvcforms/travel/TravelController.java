package edu.wctc.mvcforms.travel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/travel")
public class TravelController {
    @Value("#{gradeLevelProp}")
    private Map<String, String> gradeLevelMap;

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        // create a student object
        ExchangeStudent theStudent = new ExchangeStudent();
        theStudent.setFirstName("Stacy");
        theStudent.setLastName("Read");

        // add student object to the model
        model.addAttribute("exchStudent", theStudent);

        // add a class with a map of countries and their codes
        model.addAttribute("countries", new CountryOptions());

        // add the school year options to the model for use by the dropdown
        model.addAttribute("gradeLevelAttr", gradeLevelMap);

        // use an enum's values for the method of travel
        model.addAttribute("travelMethods", TravelMethod.values());

        // return name of view template
        return "travel/travel-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("exchStudent") ExchangeStudent theStudent) {
        // Some output to prove that Spring populated the ExchangeStudent object
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        System.out.println(theStudent.getHomeCountry());
        System.out.println(theStudent.getHostCountry());
        System.out.println(theStudent.getGradeLevel());
        return "travel/travel-confirmation";
    }
}
