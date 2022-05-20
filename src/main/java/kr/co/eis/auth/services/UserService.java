package kr.co.eis.auth.services;

import kr.co.eis.auth.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.services
 * fileName   : UserService
 * author     : MinHye_Sim
 * date       : 2022-05-04
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-04   MinHye_Sim   최초 생성
 */


public interface UserService {

    //String login(User user);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    long count();

    String save(User user);

    boolean existsById(long l);

    Optional<User> findById(long l);

    String delete(User user);

    //String put(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    List<User> findByUserName(String name);

    //custom

}
