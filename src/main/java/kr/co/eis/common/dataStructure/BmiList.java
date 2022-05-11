package kr.co.eis.common.dataStructure;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.co.eis.common.dataStructure
 * fileName   : BmiList
 * author     : MinHye_Sim
 * date       : 2022-05-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-11   MinHye_Sim   최초 생성
 */
//Height(double), Weight , 생년월일 SSN(900101-1), Gender
public class BmiList {
    public static void main(String[] args) {

    }

    @Data static class Bmi{
        private double height, weight;
        private String ssn, gender;
    }

    interface BmiService{
        void save (Bmi bmi);
        void update (int i, Bmi bmi);
        void delete (Bmi bmi);
        List<Bmi> findAll();
        List<Bmi> findBySsn(String ssn);
        List<Bmi> findByGender(String gender);
        List<Bmi> findByHeight(double height);
        List<Bmi> findByWeight(double weight);
        Bmi findById(int i);
        int count();
        boolean existById(String id);

    }

    static class BmiServiceImpl implements BmiService{
        private final List<Bmi>list;

        public BmiServiceImpl(List<Bmi> list) {
            this.list = list;
        }

        @Override
        public void save(Bmi bmi) {
            list.add(bmi);
        }

        @Override
        public void update(int i, Bmi bmi) {
            list.set(i,bmi);
        }

        @Override
        public void delete(Bmi bmi) {
            list.clear();

        }

        @Override
        public List<Bmi> findAll() {
            return null;
        }

        @Override
        public List<Bmi> findBySsn(String ssn) {
            return null;
        }

        @Override
        public List<Bmi> findByGender(String gender) {
            return null;
        }

        @Override
        public List<Bmi> findByHeight(double height) {
            return null;
        }

        @Override
        public List<Bmi> findByWeight(double weight) {
            return null;
        }

        @Override
        public Bmi findById(int id) {
            return list.get(id);
        }

        @Override
        public int count() {
            return list.size();
        }

        @Override
        public boolean existById(String id) {
            return list.isEmpty();
        }
    }



}
