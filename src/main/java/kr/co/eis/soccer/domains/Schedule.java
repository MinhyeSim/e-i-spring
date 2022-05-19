package kr.co.eis.soccer.domains;
import lombok.*;
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
 * 2022-05-19      MinHye_Sim          수정
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @Column(name = "schedule_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long scheduleNo;
    @Column(nullable = false) private String scheduleId;
    private String scheDate;
    private String gubun;
    private String homeTeamId;
    private String awayTeamId;
    private String homeScore;
    private String awayScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    Stadium stadium;
}