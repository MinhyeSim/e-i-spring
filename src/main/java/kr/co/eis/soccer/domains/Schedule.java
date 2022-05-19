package kr.co.eis.soccer.domains;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   :   com.toomuchcoder.api.soccer.domains
 * fileName      :   Schedule
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
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    private String stadiumid;
    private String scheDate;
    private String gubun;
    private String homeTeamid;
    private String awayTeamid;
    private String homeScore;
    private String awayScore;
}