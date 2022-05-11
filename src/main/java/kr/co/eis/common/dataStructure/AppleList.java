package kr.co.eis.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        while(true){
            System.out.println("0.exit 1.save 2.update 3.remove 4.findAll 5.findByOrigin 6.findByColor 7.count 8.existsById");
            switch (scanner.next()){
                case "0":break;
                case "1":
                    Apple yd = new Apple.Builder()
                            .origin("영동")
                            .color("RED")
                            .price(1000)
                            .build();
                    service.save(yd);
                    Apple yd2 = new Apple.Builder()
                            .origin("영동")
                            .color("BLUE")
                            .price(1500)
                            .build();
                    service.save(yd2);
                    Apple pg = new Apple.Builder()
                            .origin("풍기")
                            .color("RED")
                            .price(2000)
                            .build();
                    service.save(pg);
                    break;
                case "2":break;
                case "3":
                    //Apple temp = new AppleList.Apple();
                    //temp.setOrigin("영동");
                    //service.delete(temp);
                    break;
                case "4":
                    System.out.println("4.findAll:\n"+service.findByAll());
                    break;
                case "5":
                    System.out.println("5.findByOrigin");
                    System.out.println(service.findByOrigin("영동"));
                    break;
                case "6":
                    System.out.println("6.findByColor:\n"+service.findByColor("RED"));
                    break;
                case "7":
                    System.out.println("총 수량: "+service.count()+"개");
                    break;
                case "8":break;
                case "9":
                    service.clear();
                    break;
                case "10":
                    System.out.println("사과 가격은");
                    break;

                default:break;
            }
        }
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
        @Override public String toString(){
            return String.format("[사과 스펙] origin : %s, color : %s, price : %d",origin, color, price);
        }
    }
    interface AppleService{
        void save (Apple apple);
        void update(int i, Apple apple);
        void delete (Apple apple);
        List<Apple> findByAll (); //all
        List<Apple> findByOrigin (String origin);
        List<Apple> findByColor (String color);
        Apple findById(int id); //unique
        int count();
        boolean existsById(String id);
        void clear();
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
            return list.stream()
                    .filter(apple -> apple.getOrigin().equals(origin))
                    .collect(Collectors.toList());
        }

        @Override
        public List<Apple> findByColor(String color) {
            return list.stream()
                    .filter(apple -> apple.getColor().equals(color))
                    .collect(Collectors.toList());
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

        @Override
        public void clear() {
            list.clear();
        }
    }
    static List<Apple> filterApples(List<Apple> list, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: list){
            if(p.test(apple)){
                result.add(apple);
            }
        }return  result;
    }
    static List<Apple> filterApplesByOrigin(List<Apple> list, String origin){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: list){
            if(origin.equals(apple.getOrigin())){
                result.add(apple);
            }
        }return  result;
    }
}
