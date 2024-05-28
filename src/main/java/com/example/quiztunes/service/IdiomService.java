package com.example.quiztunes.service;

import com.example.quiztunes.controller.IdiomController;
import com.example.quiztunes.entity.Idiom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class IdiomService {

    private static final Logger logger = LoggerFactory.getLogger(IdiomController.class);


    private final List<Idiom> idioms;

    public IdiomService() {
        idioms = new ArrayList<>();
        idioms.add(new Idiom(1L, "오매불망", "자나깨나 잊지 못함"));
        idioms.add(new Idiom(2L, "주경야독", "낮에는 농사짓고 밤에는 공부한다는 뜻으로, 바쁜 틈을 타서 어렵게 공부함을 이르는 말"));
        idioms.add(new Idiom(3L, "청출어람", "제자나 후배가 스승이나 선배보다 나음"));
        idioms.add(new Idiom(4L, "전광석화", "매우 짧은 시간이나 매우 재빠른 움직임"));
        idioms.add(new Idiom(5L, "초지일관", "처음에 세운 뜻을 끝까지 밀고 나감"));
        idioms.add(new Idiom(6L, "철두철미", "처음부터 끝까지 철저하게"));
        idioms.add(new Idiom(7L, "섬섬옥수", "가냘프고 고운 여자의 손을 이르는 말"));
        idioms.add(new Idiom(8L, "단도직입", "목표에 확신을 가지고 즉시 용맹하게 온 힘을 다해 돌진하는 것"));
        idioms.add(new Idiom(9L, "오리무중", "오 리나 되는 짙은 안개 속에 있다는 뜻으로, 무슨 일에 대하여 방향이나 갈피를 잡을 수 없음을 이르는 말"));
        idioms.add(new Idiom(10L, "일장춘몽", "한바탕의 봄 꿈이라는 뜻으로, 인생의 부귀영화가 덧없이 사라짐을 비유하는 말"));
        idioms.add(new Idiom(11L, "왈가왈부", "어떤 일에 대하여 옳으니 그르니 함"));
        idioms.add(new Idiom(12L, "파란만장", "사람의 생활이나 일의 진행이 여러 가지 곡절과 시련이 많고 변화가 심함"));
        idioms.add(new Idiom(13L, "이율배반", "서로 모순되어 양립할 수 없는 두 개의 명제"));
    }

    public List<Idiom> findAllIdiomShuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(idioms, new Random(seed));
        logger.info("Idioms : {}", idioms.size());
        return idioms;
    }

}
