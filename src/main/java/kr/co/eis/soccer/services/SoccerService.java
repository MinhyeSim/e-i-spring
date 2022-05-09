package kr.co.eis.soccer.services;

import kr.co.eis.board.domains.Article;
import kr.co.eis.soccer.domains.Soccer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: kr.co.eis.soccer.services
 * fileName   : SoccerService
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */

public interface SoccerService {
    List<Soccer> findAll();
    List<Soccer> findAll(Sort sort);
    Page<Soccer> findAll(Pageable pageable);
    long count();
    String delete(Article article);
    String save(Article article);
}
