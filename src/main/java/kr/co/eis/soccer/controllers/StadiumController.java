package kr.co.eis.soccer.controllers;

import kr.co.eis.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName   :   com.toomuchcoder.api.soccer.controllers
 * fileName      :   StadiumController
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/stadium")
public class StadiumController {
    private final StadiumService service;
}