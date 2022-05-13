package kr.co.eis.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.List;
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







}
