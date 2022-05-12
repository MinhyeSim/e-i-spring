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
    private final ArrayList<T> list;
    public Box(){this.list = new ArrayList<>();}

    




}
