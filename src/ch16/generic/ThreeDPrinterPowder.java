package ch16.generic;

public class ThreeDPrinterPowder {
    private Object material;

    public Object getMaterial() {
        return material;
    }
    public void setMaterial(Object material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "재료는 " + material + "입니다.";
    }


}
