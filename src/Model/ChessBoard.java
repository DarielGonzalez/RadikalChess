package Model;

public class ChessBoard implements Cloneable{
    private final Cell[][] cell;
    
    public ChessBoard (int row, int column){
        cell= new Cell[row][column];
    }
    

  public Cell [][] getCell(){
      return cell;
  }
    public int getColumn(){
        return cell.length;
    }
    public int getRow(){
        return cell[0].length;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }
}
