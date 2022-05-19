package kr.co.eis.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   :   com.toomuchcoder.api.soccer.domains
 * fileName      :   Player
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 * 2022-05-19      MinHye_Sim          수정
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "players")
public class Player {
    @Id @Column(name = "player_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long playerNo;
    @Column(nullable = false) private String playerId;
    @Column(nullable = false) private String PlayerName;
    private String ePlayerName;
    private String nickName;
    private String joinYyyy;
    private String position;
    private String backNo;
    private String nation;
    private String birthDate;
    private String solar;
    private String height;
    private String weight;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;





}