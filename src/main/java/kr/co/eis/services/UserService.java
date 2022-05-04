package kr.co.eis.services;

import kr.co.eis.domains.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

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

    String login(User user);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    long count();

    void save(User user);


    boolean existsById(long l);

    Optional<User> findById(long l);

    void delete(User entity);
}
