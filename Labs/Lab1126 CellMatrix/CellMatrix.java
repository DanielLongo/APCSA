
/**
 * 
 * CellMatrix
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */
    
    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
       cells = new Cell[a][b];
       
    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for(int i = 0; i < cells.length; i++) {
            for(int y = 0; y < cells[0].length; y++) {
                System.out.print(cells[i][y].getInt() + " ");
            }
            System.out.print("\n");
        }
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for(int i = 0; i < cells.length; i++) {
            for(int y = 0; y < cells[0].length; y++) {        
                cells[i][y] = new Cell((int)(Math.random() *10) + 1);
            }
        }
    }
    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int max = -1;
        Cell argmax = new Cell(0);
        for(int i = 0; i < cells.length; i++) {
            for(int y = 0; y < cells[0].length; y++) {
                if (cells[i][y].getNeighborSum() > max) {
                    argmax = cells[i][y];
                    max = argmax.getNeighborSum();
                }
            }
        }
        return argmax.getInt();
    }
    
        //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        Cell[] currNeighbors = new Cell[4];
        Cell zeroCell = new Cell(0);
        for(int i = 0; i < cells.length; i++) {
            for(int y = 0; y < cells[0].length; y++) {
                System.out.println(" i,y " + i + " " + y);
                if (i == 0) currNeighbors[0] = zeroCell;
                else currNeighbors[0] = cells[i-1][y];
                if (i == cells.length-1) currNeighbors[2] = zeroCell;
                            else currNeighbors[2] = cells[i+1][y]; 
                if (y == 0) currNeighbors[1] = zeroCell;
                else currNeighbors[1] = cells[i][y-1];
                if (y == cells[0].length-1) currNeighbors[3] = zeroCell;
                else currNeighbors[3] = cells[i][y+1];
                cells[i][y].setNeighbors(currNeighbors);
            }
        }
    }
}
