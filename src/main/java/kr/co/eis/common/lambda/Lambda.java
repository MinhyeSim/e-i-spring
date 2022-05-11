package kr.co.eis.common.lambda;

import java.util.function.Function;

/**
 * packageName: kr.co.eis.common.lambda
 * fileName   : LambdaUtil
 * author     : MinHye_Sim
 * date       : 2022-05-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-11   MinHye_Sim   최초 생성
 */
public class Lambda {
    public static void main(String[] args) {
        //System.out.println(Lambda.integer("900"));
        System.out.println(Lambda.string(15));
    }
    public static int integer(String arg){
        //Inter = String.valueOf(Object);
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);
    }
    public static String string(Object arg){
        //String s = String.valueOf(Object);
        Function<Object, String> f = String::valueOf;
        return f.apply(arg);
    }
}
