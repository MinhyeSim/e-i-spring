package kr.co.eis.controllers;

import kr.co.eis.domains.User;
import kr.co.eis.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return service.login(user);
    }

    @GetMapping("/logout")
    public String logout() {
        return "";
    }

    @GetMapping("/findAll")
    public List<User> findAll(@RequestBody User user) {
        return service.findAll();
    }

    @GetMapping("/findAll/Sort")
    public List<User> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/Pageable")
    public Page<User> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count(@RequestBody User user) {
        return service.count();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody User entity) {
        service.delete(entity);
        return null;

    }

    @PostMapping("/join")
    public String save(@RequestBody User user) {
        service.save(user);
        return "";
    }

    @GetMapping("/findById/{userid}")
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(0L);
    }

    @GetMapping("/existById/{userid}")
    public boolean existsById(Long aLong) {
        return service.existsById(0L);//userid 타입이 다름
    }

    @PutMapping("/put")
    public boolean put(Long aLong) {
        return false;
    }


}
