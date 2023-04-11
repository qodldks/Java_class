package ch16.generic2;

public class GenericExam {
    public static void main(String[] args) {
        //타입을 제한
        ThreeDPrinterGeneric<Plastic> threeDPrinterGeneric = new ThreeDPrinterGeneric<>();
//        ThreeDPrinterGeneric<Water> threeDPrinter = new ThreeDPrinterGeneric<>(); 에러
    }
}
