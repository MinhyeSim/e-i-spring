package kr.co.eis.soccer.services;

import kr.co.eis.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.eis.soccer.services
 * fileName   : ScheduleService
 * author     : MinHye_Sim
 * date       : 2022-05-19
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-19   MinHye_Sim   최초 생성
 */
public interface ScheduleService {
    List<Schedule> findAll();

    List<Schedule> findAll(Sort sort);

    Page<Schedule> findAll(Pageable pageable);

    long count();

    String delete(Schedule schedule);

    String save(Schedule schedule);

    Optional<Schedule> findById(String scheduleId);

    boolean existsById(String scheduleId);

    Schedule getOne(Long id);
}
