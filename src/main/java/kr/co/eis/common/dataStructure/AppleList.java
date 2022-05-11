package kr.co.eis.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

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
        void update(int i, Apple apple);
        void delete (Apple apple);
        List<Apple> findByAll (); //all
        List<Apple> findByOrigin (String origin);
        List<Apple> findByColor (String color);
        Apple findById(int i); //unique
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
            list.add(apple);
        }

        @Override
        public void update(int i,Apple apple) {
            list.set(i, apple);
        }

        @Override
        public void delete(Apple apple) {
            list.clear();
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
        public Apple findById(int i) {
            return list.get(i);
        }


        @Override
        public int count() {
            return list.size();
        }

        @Override
        public boolean existsById(String id) {
            return list.isEmpty();
        }
    }



}
