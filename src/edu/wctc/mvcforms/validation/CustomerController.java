package edu.wctc.mvcforms.validation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/validation")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("theCustomer", new Customer());
        return "validation/customer-form";
    }

    @RequestMapping("/processForm")
    // BindingResult parameter must immediately follow the attribute being validated!!
    public String processForm(@Valid @ModelAttribute("theCustomer") Customer theCustomer,
                              BindingResult bindingResult) {
        // Send user back to the original form if errors were found
        if (bindingResult.hasErrors()) {
            return "validation/customer-form";
        }
        // No errors, send user to confirmation page
        return "validation/customer-confirmation";
    }
}
