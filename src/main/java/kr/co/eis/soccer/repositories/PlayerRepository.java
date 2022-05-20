package kr.co.eis.soccer.repositories;
import kr.co.eis.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName   :   com.toomuchcoder.api.soccer.repositories
 * fileName      :   PlayerRepository
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 * 2022-05-19      MinHye_Sim          수정
 */

interface PlayerCustomRepository{
    // 선수들의 키와 몸무게를 변경하시오
    @Modifying
    @Query(value="")
    int update();

    // 002. 플레이어의 포지션 종류를 나열하시오.단 중복은 제거하시오
    @Query(value = "select distinct p.position from Player p")
    List<String> findPositions();

    // 004. 수원팀에서 골키퍼(GK)의 이름을 모두 출력하시오.
    // 단 수원팀 ID는 K02 입니다.
    @Query(value = "select p.playerName \n"
            + "from Player p \n"
            + "where p.teamId like :teamId and p.position like :teamId%")
    List<String> findTeamGKByTeamId();

    // 005. 수원팀에서 성이 고씨이고 키가 170 이상인 선수를 출력하시오.
    // 단 수원팀 ID는 K02 입니다.
    @Query(value = "select p.playerName \n"
            + "from Player p \n"
            + "where p.teamId like :teamId \n"
            + "and p.playerName like :#{#paramPlayer.familyName} \n"
            + "and p.height >= :#{#paramPlayer.height}")
    List<Player> findPlayers(@Param(value = "paramPlayer") Player player, @Param(value = "paramPlayer") String teamId);


}

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}