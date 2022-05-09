package kr.co.eis.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName: kr.co.eis.soccer.domains
 * fileName   : SoccerDomain
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */
@Data
@Component
@Entity
@Table(name = "soccers")
public class Soccer {
    @Id private Long id;
    @Column(nullable = false) private String teamId;
    @Column(nullable = false) private String teamName;
    @Column(nullable = false) private String playerName;
    @Column(nullable = false) private String playerHeight;
    @Column(nullable = false) private String playerWeight;
    @Column(nullable = false) private String playerPosition;
    @Column(nullable = false) private String stadiumId;
    @Column(nullable = false) private String stadiumName;
    @Column(nullable = false) private String regionName;


}
