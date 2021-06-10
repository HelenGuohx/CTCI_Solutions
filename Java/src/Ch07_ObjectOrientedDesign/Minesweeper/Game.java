package Ch07_ObjectOrientedDesign.Minesweeper;

import java.util.Scanner;

/**
 * @author: haixuanguo
 * @date: 4/25/21 12:55 PM
 */
enum GameState {WIN, LOSE, PLAYING, EXIT;}

public class Game {

    private GameState state;
    private Grid grid;

    public void initGrid(int nrows_, int ncols_, int nbombs) {
        grid = new Grid(nrows_, ncols_, nbombs);
    }

    public void startGame(){
        state = GameState.PLAYING;
    }

    public void playGame(){
        Scanner sc = new Scanner(System.in);

        while(state == GameState.PLAYING){
            int row = sc.nextInt();
            int col = sc.nextInt();
            boolean isFlag = sc.nextBoolean();
            state = grid.playFlip(new PlayerCommand(row, col, isFlag));
        }
        if(state == GameState.WIN){
            System.out.println("Player wins");
        }else if(state == GameState.LOSE){
            System.out.println("Player lose");
        }

    }

}
