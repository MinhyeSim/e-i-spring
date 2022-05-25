package kr.co.eis.user.controllers;

import kr.co.eis.auth.domains.Messenger;
import kr.co.eis.user.domains.User;
import kr.co.eis.user.domains.UserDTO;
import kr.co.eis.user.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<UserDTO> login(@RequestBody User user) {
        return ResponseEntity.ok(service.login(user));
        //엔티티니까 실제 값을 보낸다
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
    public Messenger count() {
        return service.count();
    }

    @PutMapping("/update")
    public Messenger update(){
        return service.update();
    }

   /* @PutMapping("/put")
    public String put(@RequestBody User user) {
        return service.put(user);
    }*/

    @DeleteMapping("/delete")
    public String delete(@RequestBody User user) { return service.delete(user); }

    @PostMapping("/join")
    public Messenger save(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("/findById/{userid}")
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(userid);
    }

    @GetMapping("/existById/{userid}")
    public Messenger existsById(@PathVariable String userid) {
        return service.existsById(userid);//userid 타입이 다름
    }




}
