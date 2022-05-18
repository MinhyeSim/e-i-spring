package kr.co.eis.common.algorithm;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : CheckSameArray
 * author     : MinHye_Sim
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17   MinHye_Sim   최초 생성
 */

public class CheckSameArray {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution {
        public int[] arr1, arr2;
        private Object result;


        @Override
        public String toString() {
            return String.format("A배열과 B배열은 %s 배열입니다 ", 
                    result);
        }

        @FunctionalInterface interface ISolution {
            Solution solution(Solution s);

        }
        @Test
        void test() {

        }
    }
}