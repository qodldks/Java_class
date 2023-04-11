package ch15;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        // 정수형을 TreeSet의 데이터의 자료형으로 했다
        set.add(3);
        set.add(1);
        set.add(2);
        for (int i : set) {
            System.out.println(i);
        }
    }
}