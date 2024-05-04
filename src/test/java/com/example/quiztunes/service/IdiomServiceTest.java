package com.example.quiztunes.service;

import com.example.quiztunes.entity.Idiom;
import com.example.quiztunes.repository.IdiomRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

class IdiomServiceTest {

    @Test
    public void testFindAllIdiomShuffle() {
        // Mock IdiomRepository 생성
        IdiomRepository idiomRepository = Mockito.mock(IdiomRepository.class);

        // 테스트에 사용할 더미 데이터 생성
        List<Idiom> dummyIdioms = Arrays.asList(
                new Idiom(1L, "사자성어1", "사자성어1 뜻"),
                new Idiom(2L, "사자성어2", "사자성어2 뜻"),
                new Idiom(3L, "사자성어3", "사자성어3 뜻")
        );

        // Mock IdiomRepository가 findAll() 메소드 호출 시 더미 데이터를 반환하도록 설정
        Mockito.when(idiomRepository.findAll()).thenReturn(dummyIdioms);

        // IdiomService 인스턴스 생성
        IdiomService idiomService = new IdiomService(idiomRepository);

        // 테스트할 때마다 다르게 반환되는지 확인하기 위해 두 번 호출
        List<Idiom> firstResult = idiomService.findAllIdiomShuffle();
        List<Idiom> secondResult = idiomService.findAllIdiomShuffle();

        // 반환된 목록이 null이 아니어야 함
        assertNotNull(firstResult);
        assertNotNull(secondResult);

        // 반환된 목록의 길이는 같아야 함
        assertEquals(firstResult.size(), secondResult.size());

        // 반환된 목록의 요소들이 모두 같은지 확인 (순서는 달라야 함)
        for (Idiom idiom : firstResult) {
            assertTrue(secondResult.contains(idiom));
        }
    }
}