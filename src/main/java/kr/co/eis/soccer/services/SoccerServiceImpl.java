package kr.co.eis.soccer.services;

import kr.co.eis.board.domains.Article;
import kr.co.eis.soccer.domains.Soccer;
import kr.co.eis.soccer.repositories.SoccerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

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


    @Override
    public List<Soccer> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Soccer> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Soccer> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Article article) {
        repository.delete(article);
        return "";
    }

    @Override
    public String save(Article article) {
        repository.save(article);
        return "";
    }
}
