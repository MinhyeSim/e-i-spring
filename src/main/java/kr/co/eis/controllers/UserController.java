package kr.co.eis.controllers;

import kr.co.eis.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: kr.co.eis.controllers
 * fileName   : UserController
 * author     : MinHye_Sim
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03   MinHye_Sim   최초 생성
 */

@RestController // 컴포넌트다 @User의 컴포넌트의 자식이다. (컴포넌트 = 프로퍼티 + 메소드)
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping ("/join")
    public String join(){ return ""; }
    @PostMapping ("/login")
    public String login(){ return ""; }
    @PostMapping("/logout")
    public String logout(){
        return "";
    }
}
