package kr.co.eis.soccer.services;

import kr.co.eis.soccer.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: kr.co.eis.soccer.services
 * fileName   : ScheduleServiceImpl
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
public class ScheduleServiceImpl implements ScheduleService{
    private final ScheduleRepository repository;
}