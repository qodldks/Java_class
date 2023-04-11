package ch09;

public class Taxi extends Car{
    private int meter;

    public Taxi(String color, String company, String model){
        super(color, company, model);
    }

    public void meterUp(){
        System.out.println("미터기를 올리다.");
        startCar();
    }

    public void stopMeter(){
        System.out.println("미터기를 끕니다.");
        stopCar();
    }

    @Override
    public  void showInfo(){
        System.out.println("택시입니다.");
    }
}
