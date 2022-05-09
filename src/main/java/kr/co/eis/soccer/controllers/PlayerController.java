package kr.co.eis.soccer.controllers;

import kr.co.eis.soccer.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: kr.co.eis.soccer.controllers
 * fileName   : PlayerController
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */
@RestController //@Controller+@ResponseBody가 결합된 어노테이션.
// 컨트롤러 클래스 하위 메서드에 @ResponseBody 어노테이션을 붙이지 않아도 문자열과 JSON등을 전송할 수 있습니다.
@RequestMapping("/player")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;
}
