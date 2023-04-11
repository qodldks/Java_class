package ch15;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // 문자열을 key의 자료형으로, 정수형을 value의 자료형으로 했다

        map.put("Shin", 18);
        map.put("Kim", 13);
        map.put("Kwon", 35);

        for (String key : map.keySet()) {
            System.out.println(key + " is " + map.get(key) + " years old.");
        }
    }
}
