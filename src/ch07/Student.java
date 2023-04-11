package ch07;

public class Student {
    private String name;
    private int grade;
    private  static int count;

    public Student(){
        count++;
    }

    public Student(String name){
        this.name = name;
        count++;
    }

    public  Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        count++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
