package kr.co.eis.user.controllers;

import io.swagger.annotations.*;
import kr.co.eis.auth.domains.Messenger;
import kr.co.eis.user.domains.User;
import kr.co.eis.user.domains.UserDTO;
import kr.co.eis.user.services.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(tags = "")//외부에서 users라고
@RestController // 컴포넌트다 @User의 컴포넌트의 자식이다. (컴포넌트 = 프로퍼티 + 메소드)
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;
    private final ModelMapper modelMapper;


    @PostMapping("/login") //엔티티 개체를 외부로 노출하지 x
    @ApiOperation(value = "${UserController.login}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something Wrong"),
            @ApiResponse(code = 422, message = "유효하지 않은 아이디/ 비밀번호")
    })
    public ResponseEntity<UserDTO> login(@RequestBody UserDTO user) {
        return ResponseEntity.ok(service.login(modelMapper.map(user,User.class)));
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

    @DeleteMapping("/delete")
    public String delete(@RequestBody User user) { return service.delete(user); }

    @PostMapping("/join")
    @ApiOperation(value = "${UserController.join}")//라우터 user를 들어와서 join에들어와서 찍히고
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something Wrong"),
            @ApiResponse(code = 403, message = "승인거절"),
            @ApiResponse(code = 402, message = "중복된 ID")
    })
    public ResponseEntity<Messenger> save(@ApiParam("Join User") @RequestBody UserDTO user) {
        System.out.println("회원가입 정보: "+user.toString());
        return ResponseEntity.ok(service.save(modelMapper.map(user,User.class)));
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
