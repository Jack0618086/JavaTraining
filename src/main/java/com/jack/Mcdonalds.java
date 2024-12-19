package com.jack;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mcdonalds {
    public static void main(String[] args) {
        File file = new File("mcdonald.txt");
        // Map 是上層抽象類別不能 new 所以用 HashSet 實作出來
        Map<String, Item> menu = new HashMap<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                String [] token = line.split(",");
                Item item = new Item(
                        token[0],
                        token[1],
                        Integer.parseInt(token[2]),
                        Integer.parseInt(token[3]));
                menu.put(item.id, item);
                line = in.readLine();
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("讀取 menu 失敗");
        }
    }
}

class Item {
    String id;
    String name;
    int calorie;
    int price;

    public Item(String id, String name, int priceint, int calorie) {
        this.calorie = calorie;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
