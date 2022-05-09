package kr.co.eis.soccer.services;

import kr.co.eis.soccer.repositories.SoccerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: kr.co.eis.soccer.services
 * fileName   : SoccerServiceImpl
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */

@Service
@RequiredArgsConstructor
public class SoccerServiceImpl implements SoccerService{
    public final SoccerRepository repository;
}
