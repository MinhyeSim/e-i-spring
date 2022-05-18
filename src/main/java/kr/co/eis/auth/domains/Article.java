package kr.co.eis.auth.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: kr.co.eis.auth.domains
 * fileName   : Article
 * author     : MinHye_Sim
 * date       : 2022-05-18
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-18   MinHye_Sim   최초 생성
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component //컴포넌트는 프로퍼티와 메소드의 집합니다.
@Entity
@Lazy
@Table(name="articles")
public class Article {
    @Id
    @Column(name = "article_id")
    @GeneratedValue
    private long articleId;

    @Column @NotNull private String title;
    @Column @NotNull private String content;
    @Column(name = "written_date") @NotNull private String writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User u;


}
