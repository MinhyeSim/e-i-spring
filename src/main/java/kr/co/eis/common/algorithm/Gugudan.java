package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import javax.persistence.Basic;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : Gugudan
 * author     : MinHye_Sim
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17   MinHye_Sim   최초 생성
 */

// 타입이 없는 것도 타입 추론이다
public class Gugudan {
  @FunctionalInterface interface ISolution{
    void solution();
  }
  @Test
  void test(){
    ISolution a = () -> {
      for (int dan = 2; dan < 10; dan += 4) { //구구단은 2단부터 시작.
        for (int i = 1; i <= 9; i++) { // 1 ~ 9 까지 곱이 나오도록 조건잡기
          for (int j = dan; j < dan + 4; j++) {
            System.out.print(j + "*" + i + "=" + (j * i) + "\t");
          }
          System.out.print("\n"); // 4개씩 출력 되어야 하므로 j*i 값 4개가 출력된 후 엔터
        }
        System.out.println("\n"); //4개의 단(2단~5단)이 모두 출력 된 후, 엔터
      }
    };
    a.solution();
  }




}
