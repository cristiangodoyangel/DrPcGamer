package com.drpcgamer.controller;

import com.drpcgamer.model.ServiceType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;

@Controller
public class AppointmentController {

    @GetMapping("/")
    public String showBookingForm(Model model) {
        model.addAttribute("serviceTypes", Arrays.asList(ServiceType.values()));
        return "index";
    }
}
