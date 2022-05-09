package kr.co.eis.soccer.controllers;

import kr.co.eis.board.domains.Article;
import kr.co.eis.soccer.domains.Soccer;
import kr.co.eis.soccer.services.SoccerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/findAll")
    public List<Soccer> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Soccer> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Soccer> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Article article) { return service.delete(article);
    }

    @PostMapping("/join")
    public String save(@RequestBody Article article) {
        return service.save(article);
    }


}
