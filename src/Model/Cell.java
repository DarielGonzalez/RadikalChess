package Model;

import javax.swing.text.Position;

public class Cell {
    private ChessPieces chessPieces;
    private Position position;
    
    public Cell(ChessPieces chessPieces, Position position){
        this.chessPieces = chessPieces;
        this.position = position;
    }
    
    public ChessPieces getChessPieces(){
        return chessPieces;
    }
    
    public void setChessPieces(ChessPieces chessPieces){
        this.chessPieces = chessPieces;
    }
    public Position getPosition (){
        return position;
    }
    public ChessPieces getDiChessPieces(Position position){
        return null;
    }

}