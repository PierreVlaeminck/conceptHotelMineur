package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.service.HostelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class WebController {

    private final HostelService hostelService;

    public WebController(HostelService hostelService) {
        this.hostelService = hostelService;
    }

    @GetMapping("/")
    public String home(Hostel hostel, Model model) {
        List<Hostel> hostelList = hostelService.findAllHostel();
        model.addAttribute("hostelList", hostelList);
        List<Hostel> hostelListByCity = hostelService.findHostelByCity(hostel);
        model.addAttribute("hostelListByCity", hostelListByCity);
        return ("index");
    }

    @GetMapping("/login")
    public String login(){
        return ("login");
    }

    @GetMapping("/inscription")
    public String register(){
        return ("userRegister");
    }

    @GetMapping("/reservation")
    public String booking(){
        return ("booking");
    }

    @GetMapping("/hotel/{id}")
    public String hotel(@PathVariable Long id, Model model){
        Hostel hostel = hostelService.findHostelByIdH(id);
        model.addAttribute("hostel", hostel);
        return ("hostel");
    }

    @GetMapping("/avis_clients")
    public String reviews(){
        return ("reviews");
    }
}
