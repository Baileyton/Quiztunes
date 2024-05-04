package com.example.quiztunes.controller;

import com.example.quiztunes.entity.Idiom;
import com.example.quiztunes.service.IdiomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IdiomController {

    private final IdiomService idiomService;

    @Autowired
    public IdiomController(IdiomService idiomService) {
        this.idiomService = idiomService;
    }

    @GetMapping("/idiom")
    public String idiom(Model model) {
        List<Idiom> idioms = idiomService.findAllIdiomShuffle();
        model.addAttribute("idioms", idioms);
        return "content/idiom";
    }
}
