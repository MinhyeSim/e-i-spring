package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : Fruits
 * author     : MinHye_Sim
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17   MinHye_Sim   최초 생성
 */
public class Fruits {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution {
        private int total, apple, grape, orange;

        @Override
        public String toString() {
            return String.format("total: %d, apple: %d, grape: %d, orange: %d ", total, apple, grape, orange);
        }

        //코드를 줄이기 위해 Service 대신 I를 붙인다
        @FunctionalInterface interface ISolution {
            Solution solution(Solution s);
        }


        @Test
        void solutionTest() {
        }
    }
}
