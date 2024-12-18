package com.jack.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for (String key : stocks.keySet()){
            System.out.println(stocks.get(key));
        }
//        set();
//        list();
//        arrayTest();
    }

    private static void set() {
        // set => 適合放不重複性的資料，並且無索引值所以無法取得單一資料
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(8);
        set.add(3);
        set.add(1);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void list() {
        // List 的特性 => 順序 / 索引值 / 可重複
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(1);
        int n3 = list.get(2);
        int n4 = list.get(3);
        System.out.println(list.size()); // 取得元素數量
        List<Integer> scores = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        for (int score : scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[4] = 2;

        int[] scores = {60, 65, 70, 75, 80};
        System.out.println(scores); // 印出來的是記憶體位置
        for (int i = 0; i <= 4; i++) {
            System.out.println(scores[i]);
        }
        for (int b : scores){
            System.out.println(b);
        }
    }
}