package kr.co.eis.board.services;

import kr.co.eis.board.domains.Article1;
import kr.co.eis.board.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName: kr.co.eis.board.services
 * fileName   : ArticleServiceImpl
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
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repository;

    @Override
    public List<Article1> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Article1> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Article1> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Article1 article) {
        repository.delete(article);
        return "";
    }

    @Override
    public String save(Article1 article) {
        repository.save(article);
        return "";
    }


}
