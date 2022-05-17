package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : PrimeNumber
 * author     : MinHye_Sim
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17   MinHye_Sim   최초 생성
 */

// int start, end;
    // int[] primes;
    // 리턴되는 값이 배열이다
public class PrimeNumber {
    @Builder @Getter @NoArgsConstructor @AllArgsConstructor
    private static class Solution{
        private int start, end;
        private List<Integer> primes;

        @Override
        public String toString(){
            return String.format("");
        }



    }

    @FunctionalInterface private interface SolutionService{
        String solution(List<Integer> list);
    }


}
