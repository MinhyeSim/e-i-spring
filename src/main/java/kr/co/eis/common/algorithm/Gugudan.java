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
  @Builder @Getter @NoArgsConstructor @AllArgsConstructor
  public static class Solution{

    @Override
    public String toString(){return String.format("");}
  }

  @FunctionalInterface interface ISolution{
    void solution();
  };
  @Test
  void test(){
    ISolution a = () -> {};
    a.solution();
  }




}
