package ch11;

public class TV implements Sound{
    public int soundLevel;

    @Override
    public void soundUp() {
        soundLevel += 1;
    }
    public void soundDown() {
        soundLevel -= 1;
    }

    @Override
    public void showInfo() {

    }

//    public void showInfo(){
//        System.out.println("TV의 현재 음량은 "+soundLevel+"입니다.");
//    }
}
