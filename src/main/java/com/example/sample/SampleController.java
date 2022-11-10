package com.example.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;

@Controller
public class SampleController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }
}
