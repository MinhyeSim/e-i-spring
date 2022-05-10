package kr.co.eis.common.dataStructure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Scanner;

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
    @Data @AllArgsConstructor class Member{
        protected String userid, name, password, profileImg, phone, email;
        @Override public String toString(){
            return String.format("[사용자 스펙] userid : %s, name : %s, password : %s, profileImg : %s, phone : %s, email : %s",userid, name, password, profileImg, phone, email);
        }
    }
    interface MemberService{
        void save(Member member);
    }
    @RequiredArgsConstructor
    class MemberServiceImpl implements MemberService{
        private final Map<String, Member> map;
        @Override
        public void save(Member member) {map.put(member.getUserid(), member);

        }
    }
}
