package com.aditya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }
    @RequestMapping("/about")
    public String about(Model model)
    {
        model.addAttribute("name","Aditya Kumar");
        model.addAttribute("currentDate", new Date().toLocaleString());
        return "about";
    }
    @GetMapping("/example-loop")
    public String iterator(Model model)
    {
        List<String> names = List.of("Ankit","Aditya","Abhishek");
        model.addAttribute("names",names);
        return "iterator";
    }
    @GetMapping("/condition")
    public String condition(Model m)
    {
        m.addAttribute("isActive",true);
        return "condition";
    }

    @GetMapping("/services")
   public String services()
   {

       return "service";
   }
   @GetMapping("/aboutnew")
   public String newAbout()
   {
       return "aboutnew";
   }
   @GetMapping("/contact")
   public String contact()
   {
       return "contact";
   }
}
