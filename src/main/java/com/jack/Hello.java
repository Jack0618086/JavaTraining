package com.jack;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World !!");
//        new Person().hello();

        String s = "abcde";
        System.out.println(s.charAt(3)); // d
        System.out.println(s.length()); // 5
        System.out.println(s.substring(1, 4)); // bcd

        // 建構子的多載 (overloading)
        Person p = new Person(1.67f, 65f);
        Person p2 = new Person("Jack", 1.81f, 75.1f); // p 代表記憶體中的 person 物件
        p2.hello();
        System.out.println(p2.bmi());

        int score = 88;
        // && 且 => 兩者皆真才為真 /  || 或
        System.out.println(score > 80 && score < 90); // true
        System.out.println(score < 80 || score > 90); // false

        char c = 'A';
        System.out.println(c > 'a'); // false

      /*int age = 27;
        Integer age2 = 31;
        char c = 'j';
        Character c2 = '我';
        byte b = 120;
        float weight = 75.5f;
        float height = 1.85f;
        double height = 181.5;
        boolean adult = true;
        boolean enroll = false;
        String name = "Jack";*/
    }
}

