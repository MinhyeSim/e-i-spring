package kr.co.eis.soccer.controllers;

import kr.co.eis.soccer.services.SoccerService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: kr.co.eis.soccer.controllers
 * fileName   : SoccerController
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */

@RestController
@RequiredArgsConstructor
public class SoccerController {
    public final SoccerService service;
}
