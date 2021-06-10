package Ch07_ObjectOrientedDesign.Minesweeper;

/**
 * @author: haixuanguo
 * @date: 4/25/21 1:10 PM
 */
public class PlayerCommand {
    int row;
    int col;
    boolean isFlag;

    public PlayerCommand(int row, int col, boolean isFlag) {
        this.row = row;
        this.col = col;
        this.isFlag = isFlag;
    }
}
