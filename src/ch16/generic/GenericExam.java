package ch16.generic;

public class GenericExam {
    public static void main(String[] args) {
        Powder powder = new Powder();
        Plastic plastic = new Plastic();
        ThreeDPrinterPowder threeDPrinterPowder = new ThreeDPrinterPowder();
        threeDPrinterPowder.setMaterial(powder);
        System.out.println(threeDPrinterPowder);

        System.out.println("=======================");

        ThreeDPrinterObject threeDPrinterObject = new ThreeDPrinterObject();
        //파우더
        threeDPrinterObject.setMaterial(powder);
        System.out.println(threeDPrinterObject);
        //플라스틱
        threeDPrinterObject.setMaterial(plastic);
        System.out.println(threeDPrinterObject);

        System.out.println("=======================");

        ThreeDPrinterGeneric<Plastic> threeDPrinterGeneric = new ThreeDPrinterGeneric();
        threeDPrinterGeneric.setMaterial(plastic);
        System.out.println(threeDPrinterGeneric.getMaterial());
    }
}
