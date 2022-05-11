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

        var s = "계산기";
        System.out.println(s);
        Calculator c = new Calculator();
        System.out.println("10 + 5 = " + c.operate(10, 5, (a, b)-> a + b));
        System.out.println("10 - 5 = " + c.operate(10, 5, (a, b)-> a - b));
        System.out.println("10 x 5 = " + c.operate(10, 5, (a, b)-> a * b));
        System.out.println("10 / 5 = " + c.operate(10, 5, (a, b) -> a / b));
    }
    interface Arithmetic{
        int operation(int a, int b);
    }
    private int operate(int a, int b, Arithmetic arith){
        return arith.operation(a,b);
    }
}
