package kz.springboot.springbootdemo.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Items> items = new ArrayList<>();

    static {
        items.add(new Items(1L, "Iphone 11 Pro", 400000));
        items.add(new Items(2L, "Iphone 12 Pro", 550000));
        items.add(new Items(3L, "Iphone 13 Pro", 650000));
        items.add(new Items(4L, "Samsung Z Fold 4", 600000));
    }

    private static Long id = 5L;

    public static ArrayList<Items> getItems() {
        return items;
    }


    public static void addItem(Items item) {
        item.setId(id);
        items.add(item);
        id++;
    }

    public static Items getItem(Long id) {
        for (Items it : items) {
            if (it.getId() == id)
                return it;
        }
        return null;
    }
}