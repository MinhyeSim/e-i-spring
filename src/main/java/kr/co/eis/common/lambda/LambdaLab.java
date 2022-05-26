package kr.co.eis.common.lambda;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.function.Supplier;

import static kr.co.eis.common.lambda.Lambda.string;

/**
 * packageName: kr.co.eis.common.lambda
 * fileName   : LambdaLab
 * author     : MinHye_Sim
 * date       : 2022-05-26
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-26   MinHye_Sim   최초 생성
 */
public class LambdaLab {
    public static String solution(){
        Supplier<String> f = () -> string(LocalDate.now());
        return f.get();
    }

    @Test
    public String testSolution() {
     return "";
    }
}
