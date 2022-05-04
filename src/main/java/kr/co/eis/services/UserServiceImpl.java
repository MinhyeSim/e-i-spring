package kr.co.eis.services;

import kr.co.eis.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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


}
