package kr.co.eis.common.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.common.streams
 * fileName   : PersonStream
 * author     : MinHye_Sim
 * date       : 2022-05-16
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-16   MinHye_Sim   최초 생성
 */
public class PersonStream {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Person {
        private String name, ssn;

        // 기능 : 회원 검색
        // Q1 : 이름 입력시 성별 출력
        // Q2 : 년도 입력시 나이 출력
        @Override
        public String toString() {
            String gender = ssn;
            String b = ssn.substring(0, 2);
            int a = Integer.parseInt(b);
            int age = 123 - a;
            if (ssn.substring(7).equals("1") || ssn.substring(7).equals("3")) {
                gender = "남성";
            } else if (ssn.substring(7).equals("2") || ssn.substring(7).equals("4")) {
                gender = "여성";
            }
            return String.format("이름 : %s, 성별: %s, 나이: %d", name, gender, age);
        }

        private String getYearAndAge(String p) {
            String b = ssn.substring(0, 2);
            int a = Integer.parseInt(b);
            int age = 123 - a;

            return String.format("연도 : %s, 나이: %d", a, age);
        }

    }

    @FunctionalInterface
    interface PersonService {
        Person search(List<Person> arr);
    }

    //Test할 때만 실행 되고 사라지도록 만드는 구조
    @Test
    void personStreamTest() {
        //DB
        List<Person> l = Arrays.asList(
                Person.builder().name("홍길동").ssn("900120-1").build(),
                Person.builder().name("김유신").ssn("970620-1").build(),
                Person.builder().name("유관순").ssn("040920-4").build()
        );
        //service
        PersonService ps = person -> person
                .stream()
                .filter(e -> e.getName().equals("홍길동"))
                .collect(Collectors.toList()).get(0);
        System.out.println(ps.search(l));
    }

}

