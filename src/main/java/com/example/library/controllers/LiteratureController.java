package com.example.library.controllers;

import com.example.library.models.Literature;
import com.example.library.sevices.LiteratureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class LiteratureController {
    private final LiteratureService literatureService;

    @GetMapping("/")
    public String literature(@RequestParam(name = "title", required = false) String title, Model model){
        var list = literatureService.listLiterature(title);
        model.addAttribute("literature", list);
        return "literature";
    }

    @GetMapping("/literature/{id}")
    public String literatureInfo(@PathVariable Long id, Model model){
        model.addAttribute("literature",literatureService.getLiteratureById(id));
        return "literature-info";
    }

    @PostMapping("/literature/create")
    public String createLiterature(Literature literature){
        literatureService.saveLiterature(literature);
        return "redirect:/";
    }

    @PostMapping("/literature/delete/{id}")
    public String deleteLiterature(@PathVariable Long id){
        literatureService.deleteLiterature(id);
        return "redirect:/";

    }

    @PostMapping("/literature/update/{id}")
    public String updateLiterature(@PathVariable Long id, Literature literature){
        literatureService.updateBybId(id, literature);
        return "redirect:/";

    }


}
