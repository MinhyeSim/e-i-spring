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
            String b = ssn.substring(0,2);
            int a = Integer.parseInt(b);
            int age = 123 - a;
            if (ssn.substring(7).equals("1")||ssn.substring(7).equals("3")) {
                gender = "남성";
            } else if (ssn.substring(7).equals("2")||ssn.substring(7).equals("4")) {
                gender = "여성";
            }
            return String.format("이름 : %s, 성별: %s, 나이: %d", name, gender, age);
        }
        /*@Override
        public String toString(){
            String b = ssn.substring(0,2);
            int a = Integer.parseInt(b);
            int age = 123 - a;

            return String.format("연도 : %s, 나이: %d", a, age);
        }*/

    }
        interface PersonService {
            Person search(List<Person> arr);

        }

        //Set<> : 중복제거, object로 출력해야하니까 List<Person>이 아닌 Person이다
        static class PersonStreamServiceImpl implements PersonService {
            @Override
            public Person search (List<Person> arr) {
                return arr
                        .stream()
                        .filter(e -> e.getName().equals("홍길동"))
                        .collect(Collectors.toList()).get(0);
            }
        }

        @Test
        void personStreamTest() {
            List<Person> p = Arrays.asList(
                    Person.builder().name("홍길동").ssn("900120-1").build(),
                    Person.builder().name("김유신").ssn("970620-1").build(),
                    Person.builder().name("유관순").ssn("040920-4").build()
            );
            //"홍길동", "900120-1"
            //"김유신", "970620-1"
            //"유관순", "040920-4"
            //남성, 여성 판단 로직
            System.out.println(new PersonStreamServiceImpl().search(p));

        }


}
