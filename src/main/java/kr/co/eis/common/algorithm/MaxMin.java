package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : MaxMin
 * author     : MinHye_Sim
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17   MinHye_Sim   최초 생성
 */

//Service로 전달 예정

public class MaxMin{
    @Builder //setter 대신 사용 test에서 메소드
    @Getter // 은닉화
    @NoArgsConstructor
    @AllArgsConstructor

    private static class Solution {
        //모두 solution을 만들 것이라서 private(?)
        //elem : element 값 1개
        private int[] arr;
        private int max, min;
        @Override
        public String toString(){
            return String.format("최소값: %d", min);
        }

    }
   @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test
    void testSolution(){
        int[] arr = {3, 1, 9, 5, 10};
        SolutionService f = e -> {
            int max = 0;
            int min = 10;
            for(int i : e.getArr()){
                if(i < min) min = i;
                if(i > max) max = i;

            }
            return Solution.builder().min(min).build();
                    ///Solution.builder().max(max).build();
        };
       Solution s = Solution.builder().arr(arr).build();
       System.out.println(f.solution(s));

    }
}
