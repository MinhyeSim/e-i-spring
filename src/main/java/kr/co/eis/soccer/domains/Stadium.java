package kr.co.eis.soccer.domains;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   :   com.toomuchcoder.api.soccer.domains
 * fileName      :   Stadium
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
@Table(name = "stadiums")
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    private String stadiumid;
    private String stadiumName;
    private String homeTeamid;
    private String seatCount;
    private String address;
    private String ddd;
    private String tel;
}