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
//@component 이유 객체를 생성하기위함.
// 생략하면 M m = new M ()를 계속 만들어야해서 메모리낭비가 심해짐  자바 oop의 생성자이다
//@Data g
// 나중에 호출하기 위함
public class Vector<T>{
    // save update delete findAll findByName findById count existById clear
    // add  set remove get X get(id) size X clear
    private final ArrayList<T> list;
    //상태가 하는 역할은 스토리지 이다
    public Vector(){this.list = new ArrayList<>();}
    public void save(T t){list.add(t);}
    public void update(int i, T t){list.set(i,t);}
    public void delete(int i){list.remove(i);}
    //public void delete2(T t){list.remove(t);}
    public List<T> findAll(){return list;}
    public T findById(int i){return list.get(i);}
    public int count(){return list.size();}
    public void clear(){list.clear();}






}
