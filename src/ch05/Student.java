package ch05;

public class Student {
    int num;
    String name;
    static String group = "SW";
    final static String school = "busan software meister";

    void study(){
        System.out.println("공부하기");
    }
    void eating(){
        System.out.println("밥먹기");
    }
    void sleeping(){
        System.out.println("잠자기");
    }
    void showInfo(){
        System.out.println("이름은 "+name+"이고, 학과는 "+group+"이고, 학번은 "+num+"입니다.");
    }

}
