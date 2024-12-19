package com.jack.io;

import java.io.*;

// 輸入案例
public class ReadTester {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        fileReader();
//        inputStrem();
    }

    private static void fileReader() {
        try {
            Reader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.print((char) n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputStrem() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        try {
            InputStream is = new FileInputStream(file);
            int n = is.read();
            while (n != -1){
//                System.out.println(n);
                System.out.print((char) n);
                n = is.read(); // 更新 n 的值，防止無限迴圈
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success");
    }
}