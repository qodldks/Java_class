package ch02;

public class ifExam {
    public static void main(String[] args) {
        int a = args.length;
        if(a==0) {
            System.out.println("매개변수를 입력하세요.");
        }else if (a==1) {
            System.out.println("입력된 매개변수는 " + args[0] + "입니다.");
        }else if (a==2) {
            System.out.println("입력된 매개변수는 " + args[0] +", " + args[1] + "입니다.");
        }else{
            System.out.println("최대 매개변수 개수는 2개입니다.");
        }
    }
}
