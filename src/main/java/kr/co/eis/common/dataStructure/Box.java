package kr.co.eis.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.co.eis.common.dataStructure
 * fileName   : Box
 * author     : MinHye_Sim
 * date       : 2022-05-12
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-12   MinHye_Sim   최초 생성
 */
@Component @Data @Lazy
public class Box<T>{
    // save update delete findAll findByName findById count existById clear
    // add  set remove get X get(id) size X clear

    private final ArrayList<T> list;
    public Box(){this.list = new ArrayList<>();}
    public void save(T t){list.add(t);}
    public void update(int i, T t){list.set(i,t);}
    public void delete(int i){list.remove(i);}
    //public void delete2(T t){list.remove(t);}
    public List<T> findAll(){return list;}
    public T findById(int i){return list.get(i);}
    public int count(){return list.size();}
    public void clear(){list.clear();}






}
