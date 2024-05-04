package com.example.quiztunes.service;

import com.example.quiztunes.controller.IdiomController;
import com.example.quiztunes.entity.Idiom;
import com.example.quiztunes.repository.IdiomRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class IdiomService {

    private static final Logger logger = LoggerFactory.getLogger(IdiomController.class);

    private final IdiomRepository idiomRepository;

    @Autowired
    public IdiomService(IdiomRepository idiomRepository) {
        this.idiomRepository = idiomRepository;
    }

    public List<Idiom> findAllIdiomShuffle() {
        List<Idiom> idioms = idiomRepository.findAll();
        long seed = System.nanoTime();
        Collections.shuffle(idioms, new Random(seed));
        logger.info("Idioms: {}", idioms);
        return idioms;
    }

}
