package kr.co.eis.common.dataStructure;

import java.util.HashMap;
import java.util.List;

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

//Box과 비슷한 해쉬맵
public class Trunk<K,V> {
    //save update delete findAll findByName findById count existsById clear
    //put  replace  remove values  get(name) get(id) size  isEmpty clear

    private final HashMap<K, V> map;

    public Trunk() {this.map = new HashMap<>();}
    public void save(K k, V v){map.put(k,v);}
    public void update(K k, V v){map.replace(k, v);}
    public void delete(K k){map.remove(k);}
    //public void delete2(T t){list.remove(t);}
    public List<V> findAll(){return (List<V>) map.values();}
    public V findById(K k){return map.get(k);}
    public int count(){return map.size();}
    public boolean existsById(){return map.isEmpty();}
    public void clear(){map.clear();}
}
