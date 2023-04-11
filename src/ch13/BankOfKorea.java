package ch13;

//한국은 유일한 기관
//싱글톤 패턴: 객체 1개를 만들고 리턴
public class BankOfKorea {
    private static BankOfKorea instance = new BankOfKorea();
    private float baseRate; //기준금리

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
    }

    private BankOfKorea(){}

    public static BankOfKorea getInstance(){
        if (instance == null){
            instance = new BankOfKorea();
        }
        return instance;
    }
}
