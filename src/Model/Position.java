package Model;

public class Position {
    private int row;
    private int columna;
   
   public Position(int row, int column){
       this.columna = column;
       this.row = row;
   }
   
   public int getRow(){
       return row;
   }
   
   public void setRow(int row ){
       this.row = row;
   }
   
   public int getColumna(){
       return columna;
   }
   
   public void setColumna(int columna){
       this.columna = columna;
   }
}
