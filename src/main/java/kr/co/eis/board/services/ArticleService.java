package kr.co.eis.board.services;

import kr.co.eis.board.domains.Article1;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: kr.co.eis.board.services
 * fileName   : ArticleService
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */
public interface ArticleService {
    List<Article1> findAll();
    List<Article1> findAll(Sort sort);
    Page<Article1> findAll(Pageable pageable);
    long count();
    String delete(Article1 article);
    String save(Article1 article);

}
