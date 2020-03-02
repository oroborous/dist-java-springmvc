package edu.wctc.mvcforms.customer.controller;

import edu.wctc.mvcforms.customer.entity.Customer;
import edu.wctc.mvcforms.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/validation")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public String showCustomerList(Model model) {
        List<Customer> list = customerService.getCustomerList();
        model.addAttribute("allCustomers", list);
        return "customer/customer-list";
    }

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
        return "customer/customer-form";
    }

    @RequestMapping("/processForm")
    // BindingResult parameter must immediately follow the attribute being validated!!
    public String processForm(@Valid @ModelAttribute("theCustomer") Customer theCustomer,
                              BindingResult bindingResult) {
        //System.out.println("Last name : |" + theCustomer.getLastName() + "|");
        //System.out.println("First name : |" + theCustomer.getFirstName() + "|");

        // For a custom error messages, you can find the specific error code
        // by printing the bindingResult object
        System.out.println();
        System.out.println(bindingResult);
        System.out.println();

        // Send user back to the original form if errors were found
        if (bindingResult.hasErrors()) {
            return "customer/customer-form";
        }
        // No errors, send user to confirmation page
        return "customer/customer-confirmation";
    }
}
