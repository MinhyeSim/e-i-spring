package kr.co.eis.auth.services;

import kr.co.eis.auth.domains.User;
import kr.co.eis.auth.repositories.UserRepository;
import kr.co.eis.common.dataStructure.Box;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.services
 * fileName   : UserServiceImpl
 * author     : MinHye_Sim
 * date       : 2022-05-04
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-04   MinHye_Sim   최초 생성
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;


    @Override //구현하는 메소드
    public String login(User user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String save(User user) {
        return null;
    }

    @Override
    public boolean existsById(long l) {
        return false;
    }

    @Override
    public Optional<User> findById(long l) {
        return Optional.empty();
    }

    @Override
    public String delete(User entity) {
        return null;
    }

    @Override
    public String put(User user) {
        return null;
    }

    @Override
    public Optional<User> findById(String userid) {
        return repository.findById(0L);
    } //userid 타입이 다름

    @Override
    public boolean existsById(String userid) {
        return repository.existsById(0L);
    } //userid 타입이 다름

    @Override
    public List<User> findByUserName(String name) {
        List<User> ls = repository.findAll();
        Box<String, User> box = new Box<>();
        // ls = box.findByUserName(ls, name);
        // ls.stream().filter(...)
        return null;
    }




}