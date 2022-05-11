package kr.co.eis.common.lambda;

/**
 * packageName: kr.co.eis.common.lambda
 * fileName   : Calculator
 * author     : MinHye_Sim
 * date       : 2022-05-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-11   MinHye_Sim   최초 생성
 */
public class Calculator {
    //함수형 프로그램으로 코딩 -> 도메인이 필요 없음
    public static void main(String... args) {

    }
    interface Arithmetic{
        int operation(int a, int b);
    }
}
