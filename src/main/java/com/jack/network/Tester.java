package com.jack.network;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
//            URL url = new URL("https://api.jsonserve.com/xlGtqQ");
            URL url = new URL("https://tcgbusfs.blob.core.windows.net/dotapp/news.json");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection(); // 轉型
            InputStream is = connection.getInputStream(); // 得到輸入串流使用 inputStream，inputStream 每次讀到的都是一個 byte
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();
            StringBuffer json = new StringBuffer();
            while (line != null) {
//                System.out.println(line);
                json.append(line);
                line = in.readLine();
            }
                System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}