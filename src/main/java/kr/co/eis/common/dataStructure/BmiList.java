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
        void update (Bmi bmi);
        void delete (Bmi bmi);
        List<Bmi> findAll();
        List<Bmi> findBySsn(String ssn);
        List<Bmi> findByGender(String gender);
        Bmi findById(int id);
        int count();
        boolean existById(String id);

    }

    static class BmiServiceImpl implements BmiService{
        private final List<Bmi> bmi;

        public BmiServiceImpl() {
            this.bmi = new ArrayList<>();
        }

        @Override
        public void save(Bmi bmi) {

        }

        @Override
        public void update(Bmi bmi) {

        }

        @Override
        public void delete(Bmi bmi) {

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
        public Bmi findById(int id) {
            return null;
        }

        @Override
        public int count() {
            return 0;
        }

        @Override
        public boolean existById(String id) {
            return false;
        }
    }



}
