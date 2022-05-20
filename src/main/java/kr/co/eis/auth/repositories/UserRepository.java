package kr.co.eis.auth.repositories;

import kr.co.eis.auth.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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



interface UserCustomRepository{
    void update(User user);
    String login(User user);
}

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
