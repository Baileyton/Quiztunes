package com.example.quiztunes.controller;

import com.example.quiztunes.entity.Idiom;
import com.example.quiztunes.service.IdiomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IdiomController {

    private final IdiomService idiomService;

    public IdiomController(IdiomService idiomService) {
        this.idiomService = idiomService;
    }

    @GetMapping("/idiom")
    public ResponseEntity<List<Idiom>> getIdiom() {
        List<Idiom> idioms = idiomService.findAllIdiomShuffle();
        if(idioms.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(idioms);
    }
}
