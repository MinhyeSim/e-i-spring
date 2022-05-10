package kr.co.eis.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName: kr.co.eis.soccer.domains
 * fileName   : Player
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */
@Data//getter&setter => 데이터를 조회하고 수정하는 역할
@Entity
@Component
@Table(name = "players")
public class Player {
    @Id private Long id;
    private String name;
    private String height;
    private String weight;
    private String position;

}
