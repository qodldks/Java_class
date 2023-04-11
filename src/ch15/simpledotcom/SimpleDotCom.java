package ch15.simpledotcom;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> location;
    private int numOfHits;

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

    public String checkYourself(String guessStr){
        int guess = Integer.parseInt(guessStr);
        String result = "miss";

        int index = location.indexOf(guess);
        if(index >= 0){
            location.remove(index);
            if(location.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }
        }
        return  result;
    }
}
