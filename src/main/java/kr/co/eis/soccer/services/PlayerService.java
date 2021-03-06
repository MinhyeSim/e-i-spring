package kr.co.eis.soccer.services;

import kr.co.eis.soccer.domains.Player;
import kr.co.eis.soccer.domains.Stadium;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.soccer.services
 * fileName   : PlayerService
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */
//추상 메소드 = 기능명세서 (우리가 이런 기능들을 쓸거야 라고 보여주기만 하는 곳)
public interface PlayerService {
    List<Player> findAll();

    List<Player> findAll(Sort sort);

    Page<Player> findAll(Pageable pageable);

    long count();

    String delete(Player player);

    String save(Player player);

    Optional<Player> findById(String playerId);

    boolean existsById(String playerId);

}
