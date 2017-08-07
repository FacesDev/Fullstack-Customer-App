package com.example.customer;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by solderedmachd on 8/4/17.
 */
@Controller
public class MainController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/Customers")
    public String customerList(Model model) {
        model.addAttribute("customers", customerService.get());
        return "Customers";
    }

    @RequestMapping("/ViewCustomer/{customerId}")
    public String viewCustomer(@PathVariable int customerId, Model model) {
        Customer selectedCustomer = customerService.getById(customerId);
        model.addAttribute("customer", selectedCustomer);
        return "ViewCustomer";
    }

    @RequestMapping("/NewCustomer")
    public String newCustomer(Model model){
        return "AddCustomer";
    }

    @RequestMapping("/AddCustomer")
    public String addCustomer(@RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName, @RequestParam(value = "email") String email, @RequestParam(value = "phone") String phone, Model model) {
            Customer customer = new Customer();
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setEmail(email);
            customer.setPhone(phone);
            customerService.add(customer);
            return "redirect:/Customers";
    }
}
