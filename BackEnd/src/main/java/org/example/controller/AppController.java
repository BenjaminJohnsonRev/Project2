//package org.example.controller;
//
//import org.example.entity.Customer;
//import org.example.services.CustomerService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class AppController {
//
//    private final CustomerService customerService;
//
//    public AppController(CustomerService customerService){
//        this.customerService = customerService;
//    }
//
//    @GetMapping("")
//    public String getRegisterPage() {
//        return "index";
//    }
//
//    @GetMapping("/register")
//    public String getRegisterPage(Model model) {
//        model.addAttribute("registerRequest", new Customer());
//        return "register_page";
//    }
//
//    @GetMapping("/login")
//    public String getLoginPage(Model model) {
//        model.addAttribute("loginRequest", new Customer());
//        return "login_page";
//    }
//
//    @PostMapping("/register")
//    public String register(@ModelAttribute Customer customer){
//        System.out.println("register request: " + customer);
//        Customer registeredCustomer = customerService.add_customer(customer.getLogin(), customer.getPassword(), customer.getEmail(), customer.getFirst_name(), customer.getLast_name());
//        return registeredCustomer == null ? "error_page" : "redirect:/login";
//    }
//
//    @PostMapping("/login")
//    public String login(@ModelAttribute Customer customer, Model model){
//        System.out.println("login request: " + customer);
//        Customer authenticated = customerService.authenticate(customer.getLogin(), customer.getPassword());
//        if (authenticated != null){
//            model.addAttribute("customerLogin", authenticated.getLogin());
//            return "personal_page";
//        } else {
//            return "error_page";
//        }
//    }
//}