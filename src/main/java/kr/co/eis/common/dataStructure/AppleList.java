package kr.co.eis.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName: kr.co.eis.common.dataStructure
 * fileName   : AppleList
 * author     : MinHye_Sim
 * date       : 2022-05-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-11   MinHye_Sim   최초 생성
 */
//Apple color price(int) origin(영동, 풍기)
public class AppleList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppleService service = new AppleServiceImpl();
    }
    @Data static class Apple{
        private String color, origin;
        private int price;

        public Apple(Builder builder){
            this.color = builder.color;
            this.origin = builder.origin;
            this.price = builder.price;

        }
        @NoArgsConstructor static class Builder{
            private String color, origin;
            private int price;
            public Builder color(String color){this.color=color; return this;}
            public Builder origin(String origin){this.origin=origin; return this;}
            public Builder price(int price){this.price=price; return this;}
            Apple build(){return new Apple(this); }
        }
    }
    interface AppleService{
        void save (Apple apple);
        void update (Apple apple);
        void delete (Apple apple);
        List<Apple> findByAll (); //all
        List<Apple> findByOrigin (String origin);
        List<Apple> findByColor (String color);
        Apple findById(int id); //unique
        int count();
        boolean existsById(String id);
    }
    //map은 key , id는 index
    static class AppleServiceImpl implements AppleService {
        private final List<Apple> list;
        //보안

        public AppleServiceImpl() {
            this.list = new ArrayList<>();
        }

        @Override
        public void save(Apple apple) {

        }

        @Override
        public void update(Apple apple) {

        }

        @Override
        public void delete(Apple apple) {

        }

        @Override
        public List<Apple> findByAll() {
            return null;
        }

        @Override
        public List<Apple> findByOrigin(String origin) {
            return null;
        }

        @Override
        public List<Apple> findByColor(String color) {
            return null;
        }

        @Override
        public Apple findById(int id) {
            return null;
        }


        @Override
        public int count() {
            return 0;
        }

        @Override
        public boolean existsById(String id) {
            return false;
        }
    }



}
