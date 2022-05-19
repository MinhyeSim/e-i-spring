package kr.co.eis.soccer.domains;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName   :   com.toomuchcoder.api.soccer.domains
 * fileName      :   Team
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
@Eager
@Table(name = "teams")
public class Team {
    @Id @Column(name = "team_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long teamId;
    private String teamId;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String orig;
    private String stadiumId;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;

    @OneToMany(mappedBy = "team")
    List<Player> players = new ArrayList<>();



}