package com.my.pharmacy.service;

import com.my.pharmacy.dto.KakaoApiResponseDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


//KAKAO_REST_API_KEY=17e3bc9f05683e6f50c936f2c696293e
@SpringBootTest
class KakaoAddressSearchServiceTest {
    @Autowired
    KakaoCategorySearchService kakaoCategorySearchService;

    @Autowired
    KakaoAddressSearchService kakaoAddressSearchService;

    @Test
    @DisplayName("API KEY Test")
    void test() {
        kakaoAddressSearchService.apiKeyTest();
    }

    @Test
    @DisplayName("Make URI String Test")
    void uriTest(){
        KakaoApiResponseDto dto = new KakaoApiResponseDto();
        dto = kakaoAddressSearchService.requestAddressSearch("강남대로 405");
        System.out.println(dto);
    }

    @Test
    @DisplayName("Search Category Test")
    void categoryTest(){
        KakaoApiResponseDto dto = new KakaoApiResponseDto();
        double x = 127.026692446306;
        double y = 37.4987750083767;
        double radius = 1000;
        dto = kakaoCategorySearchService.resultCategorySearch(x,y,radius);
        System.out.println(dto);
    }
}