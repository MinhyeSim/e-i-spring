package kr.co.eis.board.controllers;

import kr.co.eis.board.domains.Article1;
import kr.co.eis.board.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName: kr.co.eis.board.controllers
 * fileName   : ArticleController
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
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService service;

    @GetMapping("/findAll")
    public List<Article1> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Article1> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Article1> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Article1 article) {
        return service.delete(article);
    }

    @PostMapping("/join")
    public String save(@RequestBody Article1 article) {
        return service.save(article);
    }



}
