package kr.co.eis.controllers;

import kr.co.eis.domains.User;
import kr.co.eis.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.controllers
 * fileName   : UserController
 * author     : MinHye_Sim
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03   MinHye_Sim   최초 생성
 */

@RestController // 컴포넌트다 @User의 컴포넌트의 자식이다. (컴포넌트 = 프로퍼티 + 메소드)
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping ("/join")
    public String join(){ return ""; }
    @PostMapping ("/login")
    public String login(){ return ""; }
    @PostMapping("/logout")
    public String logout(){
        return "";
    }
    public List<User> findAll() {
        return null;
    }
    public List<User> findAll(Sort sort) {
        return null;
    }
    public Page<User> findAll(Pageable pageable) {
        return null;
    }
    public long count() {
        return 0;
    }
    public void delete(User entity) {

    }
    public <S extends User> S save(S entity) {
        return null;
    }
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }
    public boolean existsById(Long aLong) {
        return false;
    }
    public User getOne(Long aLong) {
        return null;
    }
    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }




}
