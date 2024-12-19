package com.jack.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir = new File("D:\\JK");
        jkDir.mkdir();
        FileWriter fw = new FileWriter("D:\\jk\\output.txt");
        fw.write("Jack");
        fw.flush(); // 呼叫 flush 方法，將資料沖到目的地
        fw.close();
    }
}