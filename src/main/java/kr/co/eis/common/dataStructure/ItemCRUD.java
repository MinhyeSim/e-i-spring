package kr.co.eis.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * packageName: kr.co.eis.common.dataStructure
 * fileName   : ItemCRUD
 * author     : MinHye_Sim
 * date       : 2022-05-10
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-10   MinHye_Sim   최초 생성
 */
public class ItemCRUD {
    public static void main(String[] args){}
    @Data @AllArgsConstructor class Item{
        private String id;
        private String name;
        private String price;
    }
    interface ItemService{
        void save(Item item);
        void update(Item item);
        void delete(Item item);
        Item findById(String id);
        List<Item> findByName(String name);
        List<Item> findAll();
        int count();
        boolean existsById(String id);
    }

    @RequiredArgsConstructor class ItemServiceImpl implements ItemService{
        @Override
        public void save(Item item) {

        }

        @Override
        public void update(Item item) {

        }

        @Override
        public void delete(Item item) {

        }

        @Override
        public Item findById(String id) {
            return null;
        }

        @Override
        public List<Item> findByName(String name) {
            return null;
        }

        @Override
        public List<Item> findAll() {
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
