package ch15;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // <>안에 저장될 요소의 자료형을 입력한다

        list.add("Java");
        list.add("ShinJoonseo");
        list.add("Design");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
