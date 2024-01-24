package com.example.banhchung.controller;

import com.example.banhchung.model.Cake;
import com.example.banhchung.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/cake")
public class CakeController {
    @Autowired
    private CakeService cakeService;

    @GetMapping()
    public String showhome ( Model model ) {
        List<Cake> listcake = cakeService.getCakeList ( );
        System.out.println ( listcake );
        model.addAttribute ( "list", listcake );
        return "/home";
    }


    @GetMapping("/add")
    public String add ( Model model ) {
        Cake cake = new Cake ( );
        model.addAttribute ( "cake", cake );

        return "/create";
    }


    @PostMapping("/create")
    public String createProduct ( @ModelAttribute("cake") Cake cake, RedirectAttributes redirectAttributes ) {

        cakeService.createCake ( cake );

        System.out.println (cake );
        redirectAttributes.addFlashAttribute ( "message", "Create successfully" );

        return "redirect:/cake";
    }
}