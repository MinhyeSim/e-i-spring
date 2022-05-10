package kr.co.eis.soccer.repositories;

import kr.co.eis.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.eis.soccer.repositories
 * fileName   : PlayerRepository
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */
@Repository
// 최상위 부모이기 때문에 아무것도 가지지 않은 무상태이다.
public interface PlayerRepository extends JpaRepository<Player, Long> {


}
