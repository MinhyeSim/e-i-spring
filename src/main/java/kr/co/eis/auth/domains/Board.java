package kr.co.eis.auth.domains;

import lombok.*;
import org.apache.catalina.LifecycleState;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.co.eis.auth.domains
 * fileName   : Board
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
@Component
@Entity
@Table(name="boards")
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue private long boardId;
    @Column @NonNull private String boardName;

    @OneToMany(mappedBy = "board")
    List<Article> articles = new ArrayList<>();

}
