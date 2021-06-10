package Ch07_ObjectOrientedDesign.Minesweeper;

/**
 * @author: haixuanguo
 * @date: 4/25/21 12:11 PM
 */

public class Cell {
    private int row;
    private int col;
    private final CellType cellType;
    private int cellValue;
    private boolean isExposed = false;
    private boolean isFlagged = false;

    public Cell(int row, int col, CellType cellType){
        this.row = row;
        this.col = col;
        this.cellType = cellType;
    }

    public int[] getRowCol() {
        return new int[]{row, col};
    }

    public void setRowCol(int row, int col) {
        this.row = row;
        this.col = col;
    }


    public CellType getCellType() {
        return cellType;
    }

    public int getCellValue() {
        return cellValue;
    }

    public void setCellValue(int cellValue) {
        this.cellValue = cellValue;
    }

    public boolean exposeCell(){
        isExposed = true;

        return cellType != CellType.BOMB;
    }

    public boolean toggleFlag(){
        if(!isExposed){
            isFlagged = !isFlagged;
        }
        return isFlagged;
    }


}
