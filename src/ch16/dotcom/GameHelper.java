package ch16.dotcom;

import java.io.*;
import java.util.ArrayList;

public class GameHelper {
    private static final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    private int[][] grid = new int[7][7];
    private int comCount;

    public String getUserInput(String prompt) {
        String inputLine;
        System.out.print(prompt + " ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            inputLine = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputLine;
    }


    public ArrayList<String> placeDotCom() {
        ArrayList<String> alphaCells = new ArrayList<>();
        int x = 0;
        int y = 0;

        comCount++;
        if(comCount % 2 == 1){
            //가로
            while (true){
                x = (int) (Math.random()*1000) % 5; //0~4 중 랜덤
                y = (int) (Math.random()*1000) % 7; //0~6 중 랜덤
                if(grid[y][x] == 0 && grid[y][x+1] ==0 && grid[y][x+2] == 0){
                    grid[y][x] = 1;
                    grid[y][x+1] = 1;
                    grid[y][x+2] = 1;
                    break;
                }
            }
            alphaCells.add(String.format(alphabet[y] + "%d",x));
            alphaCells.add(String.format(alphabet[y] + "%d",x+1));
            alphaCells.add(String.format(alphabet[y] + "%d",x+2));
        }else {
            //세로
            while (true) {
                x = (int) (Math.random() * 1000) % 7; //0~6 중 랜덤
                y = (int) (Math.random() * 1000) % 5; //0~4 중 랜덤
                if (grid[y][x] == 0 && grid[y + 1][x] == 0 && grid[y + 2][x] == 0) {
                    grid[y][x] = 1;
                    grid[y+1][x] = 1;
                    grid[y+2][x] = 1;
                    break;
                }
            }
            alphaCells.add(String.format(alphabet[y] + "%d",x));
            alphaCells.add(String.format(alphabet[y+1] + "%d",x));
            alphaCells.add(String.format(alphabet[y+2] + "%d",x));
        }

        return alphaCells;
    }

    public void printAll() {
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
