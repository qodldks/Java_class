package ch16.dotcom;

import java.util.ArrayList;

public class DotComBust {
    private ArrayList<DotCom> dotComs = new ArrayList<DotCom>();
    private GameHelper gameHelper = new GameHelper();
    private int numOfGuesses;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame() {
        // dotcom 생성
        dotComs.add(new DotCom("google.com"));
        dotComs.add(new DotCom("kakao.com"));
        dotComs.add(new DotCom("naver.com"));

        //dotcom 위치값 추가
        for (DotCom dotCom : dotComs) {
            ArrayList<String> newLocation = gameHelper.placeDotCom();
            dotCom.setLocation(newLocation);
        }
//        gameHelper.printAll();
    }

    private void startPlaying() {
        while (!dotComs.isEmpty()){
            String userGuess = gameHelper.getUserInput("enter your guess :");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotCom : dotComs) {
            result = dotCom.checkYourSelf(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComs.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println(numOfGuesses);
        if(numOfGuesses <= 18) {
            System.out.println("잘했어요 :)");
        }else{
            System.out.println("너무 오래걸렸어요 :(");
        }
    }


}
