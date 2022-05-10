package kr.co.eis.common.dataStructure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * packageName: kr.co.eis.common.algorithm.dataStructure
 * fileName   : MemberCRUD
 * author     : MinHye_Sim
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   MinHye_Sim   최초 생성
 */
public class MemberCRUD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MemberService service = new MemberServiceImpl();

        while(true){
            System.out.println("0.exit 1.save 2.update 3.remove 4.findById 5.findByName 6.findAll 7.count 8.existsbyId ");
            switch (scanner.next()){
                case "0":break;
                case "1":break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":break;
                case "6":break;
                case "7":break;
                default:break;
            }
        }
    }
    @Data @AllArgsConstructor
    static class Member{
        protected String userid, name, password, profileImg, phone, email;
        @Override public String toString(){
            return String.format("[사용자 스펙] userid : %s, name : %s, password : %s, profileImg : %s, phone : %s, email : %s",userid, name, password, profileImg, phone, email);
        }
    }
    interface MemberService{
        void save(Member member);
        void update(Member member);
        void delete(Member member);
        Member findById(String id);
        List<Member> findByName(String name);
        List<Member> findByAll();
        int count();
        boolean existsById(String id);
    }

    static class MemberServiceImpl implements MemberService{
        Map <String, Member> map;

        MemberServiceImpl(){
            this.map = new HashMap<>();
        }

        @Override
        public void save(Member member) {map.put(member.getUserid(), member);

        }

        @Override
        public void update(Member member) {map.replace(member.getUserid(), member);

        }

        @Override
        public void delete(Member member) {map.remove(member.getUserid(), member);

        }

        @Override
        public Member findById(String id) {
            return map.get(id);
        }

        @Override
        public List<Member> findByName(String name) {
            return (List<Member>) map.get(name);
        }

        @Override
        public List<Member> findByAll() {
            return (List<Member>) map.values();
        }

        @Override
        public int count() {
            return map.size();
        }

        @Override
        public boolean existsById(String id) {
            return map.isEmpty();
        }
    }
}
