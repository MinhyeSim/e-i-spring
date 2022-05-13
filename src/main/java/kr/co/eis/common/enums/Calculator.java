package kr.co.eis.common.enums;

import lombok.RequiredArgsConstructor;

import java.util.function.BiFunction;

/**
 * packageName: kr.co.eis.common.enums
 * fileName   : Calculator
 * author     : MinHye_Sim
 * date       : 2022-05-13
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-13   MinHye_Sim   최초 생성
 */
public class Calculator {
    public static void main(String[] args) {

    }
    @RequiredArgsConstructor
    enum Operation{
    //enum자체가 static file(?)를 가지고 있기 때문에 별도의 static이 필요 없다
        private final String opcode;
        //수 먼저 구성 (숫자 2개가 들어가고 1개가 리턴)
        private BiFunction<Integer, Integer, Integer> expression;
        
    }


}
