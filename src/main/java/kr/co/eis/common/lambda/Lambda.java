package kr.co.eis.common.lambda;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.function.*;

import static kr.co.eis.common.dataStructure.AppleList.Apple;

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
        System.out.println(Lambda.integer("900"));
        System.out.println(Lambda.string(15));
        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
        System.out.println(
                string(
                        Arrays.asList(

                                new Apple.Builder().origin("영동").color("RED").price(3000).build(),
                                new Apple.Builder().origin("영동").color("RED").price(3000).build(),
                                new Apple.Builder().origin("영동").color("RED").price(3000).build()
                        ))
                 );
        System.out.println(equals("a","a"));
        System.out.println(array(5).length);
        System.out.println(random(1,6));



    }
    public static long longParse(String s){
        Function<String, Long> f = Long::parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String, Float> f = Float::parseFloat;
        return f.apply(s);
    }
    public static int integer(String arg){
        //Integer i = String.valueOf(Object);
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);
    }
    public static String string(Object o){
        //String s = String.valueOf(o);
        Function<Object, String> f = String::valueOf;
        return f.apply(o);
    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1, s2);
    }
    //int[] arr = new int[8];
    // =int[]::new
    // 1. 클래식 자바 2. 모던 자바 3. 람다(팩토리 패턴)

    //메소드 참조 형식
    public static int[] array(int a){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(a);
    }

    // 람다식
    public static int random(int min, int max){
        BiFunction<Integer, Integer, Integer> f = (min1, max1) -> (int)(Math.random()*max)+min;
        return f.apply(min,max);
    }
    //File file = new File("d:\\example\\new_directory");
    public static File makefile(String a){
        Function<String, File> f = File::new;
        return f.apply(a);
    }
    public static String date() {
        Supplier<String> f = () -> string(LocalDate.now());
        return f.get();
    }





}
