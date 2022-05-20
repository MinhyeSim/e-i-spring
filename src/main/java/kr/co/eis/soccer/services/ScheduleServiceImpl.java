package kr.co.eis.soccer.services;

import kr.co.eis.soccer.domains.Schedule;
import kr.co.eis.soccer.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Schedule> findAll() {
        return null;
    }

    @Override
    public List<Schedule> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Schedule> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String delete(Schedule schedule) {
        return null;
    }

    @Override
    public String save(Schedule schedule) {
        return null;
    }

    @Override
    public Optional<Schedule> findById(String scheduleId) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String scheduleId) {
        return false;
    }

    @Override
    public Schedule getOne(Long id) {
        return null;
    }
}