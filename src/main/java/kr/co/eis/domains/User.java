package kr.co.eis.domains;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * packageName: kr.co.eis.domains
 * fileName   : User
 * author     : MinHye_Sim
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03   MinHye_Sim   최초 생성
 */
@Data //메소드로 생성해준다.
@Component //컴포넌트는 프로퍼티와 메소드의 집합니다.
@Entity
public class User {
    @Id private Long id;
    private String userid;
    private String password;
    private String email;
    private String name;
    private String phone;
    private String birth;
    private String address;




}
