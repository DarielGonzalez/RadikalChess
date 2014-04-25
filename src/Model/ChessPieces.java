package Model;

import java.awt.Image;
import javax.swing.text.Position;

/**
 *
 * @author usuario
 */
public abstract class ChessPieces {
    
    private String name;
    private Position position;
    private Image image;
    private final String colores;

    public ChessPieces(String name, String colores, Position position, Image image){
        this.colores = colores;
        this.name = name;
        this.position = position;
        this.image = image;
    }
    
    public String getName(){
        return name;
    }
    
    public Position getPosition(){
        return position;
    }
    
    public Image getimImage (){
        return image;
    }
    public String getColor(){
        return colores;
    }
}

