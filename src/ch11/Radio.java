package ch11;

public class Radio implements Sound{
    public int soundLevel;

    @Override
    public void soundUp() {
        soundLevel += 2;
    }
    public void soundDown() {
        soundLevel -= 2;
    }

    @Override
    public void showInfo() {

    }
}
