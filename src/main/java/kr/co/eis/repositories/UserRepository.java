package kr.co.eis.repositories;

import kr.co.eis.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName: kr.co.eis.repositories
 * fileName   : UserRepository
 * author     : MinHye_Sim
 * date       : 2022-05-04
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-04   MinHye_Sim   최초 생성
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
