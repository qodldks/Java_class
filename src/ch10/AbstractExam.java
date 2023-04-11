package ch10;

public class AbstractExam {
    public static void main(String[] args) {
        Myship myship = new Myship("동해선");

        System.out.println(myship.maxPassengers());
        System.out.println(myship.maxLuggage());
    }
}

