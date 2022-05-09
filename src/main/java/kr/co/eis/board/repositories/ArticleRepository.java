package kr.co.eis.board.repositories;

import kr.co.eis.board.domains.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.board.repositories
 * fileName   : ArticleRepository
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
