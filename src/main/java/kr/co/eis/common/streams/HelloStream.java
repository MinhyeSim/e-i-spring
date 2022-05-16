package kr.co.eis.common.streams;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.common.streams
 * fileName   : HelloStream
 * author     : MinHye_Sim
 * date       : 2022-05-16
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-16   MinHye_Sim   최초 생성
 */
//한국어로 안녕, 영어로 Hello

public class HelloStream {
    @Data
    public static class Hello {
        private String greeting, inLanguage;

        public Hello(Builder builder){
            this.greeting = builder.greeting;
            this.inLanguage = builder.inLanguage;
        }
        @NoArgsConstructor
        static public class Builder{
            public String greeting;
            public String inLanguage;

            public Builder greeting(String greeting){this.greeting=greeting;return this;}
            public Builder inLanguage(String inLanguage){this.inLanguage=inLanguage;return  this;}
            public Hello build(){return new Hello(this);}

        }
    }
    interface HelloService {

        Set<String> greet (String[] arr);
        }
    static class HelloServiceImpl implements HelloService {

        @Override
        public Set<String> greet(String[] arr) {
            return Arrays.asList(arr)
                    .stream()
                    .filter(e -> e.startsWith("한국어"))
                    .collect(Collectors.toSet());
        }
    }

        @Test
            void helloStreamTest(){
                String[] arr = {"한국어 안녕","영어 Hello"};
                HelloService s = new HelloServiceImpl();
                Set<String> s2 = s.greet(arr);
                s2.forEach(System.out::println);

            }
        }

    





