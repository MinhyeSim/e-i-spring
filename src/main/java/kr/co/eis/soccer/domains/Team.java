package kr.co.eis.soccer.domains;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

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
 */

@Data
@Component
@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    private String teamid;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String orig;
    private String stadiumid;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;
}