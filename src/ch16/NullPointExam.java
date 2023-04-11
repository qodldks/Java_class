package ch16;

public class NullPointExam {
    public static void main(String[] args) {
        String str = null;
        // System.out.println(str.length()); 에러
        try{
            System.out.println(str.length());
        } catch (NullPointerException npe){
            System.out.println(npe.getMessage());
        }

    }
}
