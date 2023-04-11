package ch10;

public class Myship extends Ship{
    private String name;

    public Myship(String name) {
        this.name = name;
    }

    @Override
    public int maxPassengers() {
        return 10;
    }
    public int maxLuggage() {
        return 100;
    }
}
