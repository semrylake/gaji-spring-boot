package com.gajiku.controllers;

import com.gajiku.entity.Gaji;
import com.gajiku.services.GajiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private GajiService gajiService; // panggil folder service, class GajiService

    @GetMapping
    public String welcome(Model model) {
        return "indexContoh";
    }

    @GetMapping("/bagikangaji")
    public String bagikangaji(Model model) {
        model.addAttribute("gaji", new Gaji());
        return "bagikangaji";
    }

    @PostMapping("/storeGaji")
    public String store(Gaji gaji, Model model, RedirectAttributes redirectAttributes) {
        gajiService.addGaji(gaji);

        redirectAttributes.addFlashAttribute("success", "success");
        return "redirect:/bagikangaji";
    }

    @PostMapping("/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        // service untuk menghapus data
        gajiService.destroyGajiById(id);
        return "redirect:/betapudata";
    }

    @GetMapping("/infogaji")
    public String infogaji(Model model) {
        model.addAttribute("gajis", gajiService.findAll()); // dari folder service, class GajiService, fun findAll()
        return "infogaji";
    }

    @GetMapping("/betapudata")
    public String alldataku(Model model) {
        model.addAttribute("gajis", gajiService.findAll()); // dari folder service, class GajiService, fun findAll()
        return "index";
    }

}
