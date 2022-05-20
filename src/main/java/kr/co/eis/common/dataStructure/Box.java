package kr.co.eis.common.dataStructure;

import kr.co.eis.board.domains.User;
import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.common.dataStructure
 * fileName   : Trunk
 * author     : MinHye_Sim
 * date       : 2022-05-12
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-12   MinHye_Sim   최초 생성
 */

//서비스는
@Data
@Component
@Lazy
public class Box<K,V> {
    //save update delete findAll findByName findById count existsById clear
    //put  replace  remove values  get(name) get(id) size  isEmpty clear

    private final HashMap<K, V> map;
    public Box() {this.map = new HashMap<>();} //

    /**
    public void save(K k, V v){map.put(k,v);}
    public void update(K k, V v){map.replace(k, v);}
    public void delete(K k){map.remove(k);}
    //public void delete2(T t){list.remove(t);}
    public List<T> findAll(){return list;}
    public T findById(int i){return list.get(i);}
    public int count(){return list.size();}
    public void clear(){list.clear();}
    */

     public void put(K k , V v){map.put(k , v);}
     public void replace(K k , V v){map.replace(k ,v);}
     public void remove(K k , V v){map.remove(k , v);}
     public List<V> values(){return map.values().stream().collect(Collectors.toList());}
     public V get(String id){return map.get(id);}
     public int size(){return map.size();}
     public void clear(){map.clear();}

    //custom (기본적으로 주어진거 외에 추가 된 것)
    public List<User> findByUserName(String name){
         List<User> ls = new ArrayList<>();
         for(User v :ls){ if(name.equals(v.getName())) ls.add(v);}
         return ls;
    }
    //회원 아이디 목록 요청시
    public List<User>findAllUserList() {
        List<User> ls = new ArrayList<>();
        for (Map.Entry<K, V> e : map.entrySet()) {
            ls.add((User) e.getValue());
        }
        return ls;
    }
    //이름으로 검색된 회원 목록 요청시(필터가 필요없이 리액트로 던지는 경우)
    public List<User> finByUserName(String name){
         List<User> ls = new ArrayList<>();
         for (User v :ls) {if (name.equals(v.getName())) ls.add(v);}
         return ls;
    }

    //이름으로 검색된 회원 목로 요청시(추가 필터를 통해 더 줄어든 결과값이 필요한 경우)
    public Map<String, User> mapFindByUserName(String name) {
        Map<String, User> map = new HashMap<>();
        for (Map.Entry<String, User> e : map.entrySet()) {
            if (name.equals((e.getValue().getName()))) map.put(e.getKey(),e.getValue());
        }
        return map;
    }
    //성능은

}



