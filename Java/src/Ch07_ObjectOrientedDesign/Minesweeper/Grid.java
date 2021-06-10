package Ch07_ObjectOrientedDesign.Minesweeper;

import javax.swing.*;

/**
 * @author: haixuanguo
 * @date: 4/25/21 12:47 PM
 */
public class Grid {
    private int nrows;
    private int ncols;
    private int nbombs;
    private int remainNonBombs;
    private Cell[] bombs;
    Cell[][] grid;


    //init grid in constructor
    public Grid(int nrows_, int ncols_, int nbombs_){
        nrows = nrows_;
        ncols = ncols_;
        nbombs = nbombs_;

        remainNonBombs = nrows * ncols - nbombs;
    }

    //generate bomb cells
    //generate blank and number cells


    public void printGrid() {
    }
    public boolean flipCell(Cell cell){
        if(cell.getCellType() == CellType.NUMBER){
            flipAdjacentCell(cell);
        }
        return cell.exposeCell();
    }

    public void flipAdjacentCell(Cell cell){
    }


    public GameState playFlip(PlayerCommand playerCommand) {
        return GameState.EXIT;
    }
}
