package kr.co.eis.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: kr.co.eis.controllers
 * fileName   : HomeController
 * author     : MinHye_Sim
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03   MinHye_Sim   최초 생성
 */
public class HomeController {
    @GetMapping("/")
        public String now(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}
