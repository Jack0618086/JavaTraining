package com.jack;

// 沒有繼承任何 [父層類別] 的話繼承的是 java.lang.obj
public class Person {
    String name;
    float height; // 屬性通常都用暗紫色代表
    float weight;

    // 在方法裡面所定義的變數稱為區域變數
    public Person(float height, float weight) {
        this.height = height; // 將傳進來的區域變數放進屬性儲存
        this.weight = weight;
    }

    public Person(String name, float height, float weight) {
        this(height, weight); // 這個方法一定要寫再次建構子的第一行要不然會報錯
        this.name = name;
    }

    public float bmi() {
/*        float BMI = weight / (height * height);
        return BMI;*/
        // 以下為上面的簡寫(inline varible)
        return weight / (height * height);
    }

    public void hello() {
        System.out.println("Hello World");
    }
}
