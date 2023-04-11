package ch16.generic2;

public class ThreeDPrinterGeneric<T extends Material> { //Material 인터페이스를 상속받은 클래스만 올 수 있음
    private T material;

    public T getMaterial() {
        return material;
    }
    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "재료는 " + material + "입니다.";
    }


}
