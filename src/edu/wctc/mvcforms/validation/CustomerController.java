package edu.wctc.mvcforms.validation;

import edu.wctc.mvcforms.travel.MapDemo;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/validation")
public class CustomerController {

    // Add an InitBinder to pre-process all web requests to this controller
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        // Remove leading and trailing whitespace
        // The true means it should trim to null if all whitespace
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        // For all strings in form data, apply this editor
        dataBinder.registerCustomEditor(String.class, ste);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("theCustomer", new Customer());
        return "validation/customer-form";
    }

    @RequestMapping("/processForm")
    // BindingResult parameter must immediately follow the attribute being validated!!
    public String processForm(@ModelAttribute String randomNumber,
                              @Valid @ModelAttribute("theCustomer") Customer theCustomer,
                              BindingResult bindingResult,
                              Model model) {
        //System.out.println("Last name : |" + theCustomer.getLastName() + "|");
        //System.out.println("First name : |" + theCustomer.getFirstName() + "|");

        System.out.println();
        System.out.println(bindingResult);
        System.out.println();

        // Send user back to the original form if errors were found
        if (bindingResult.hasErrors()) {
            return "validation/customer-form";
        }
        // No errors, send user to confirmation page
        return "validation/customer-confirmation";
    }
}
