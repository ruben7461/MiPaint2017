
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javafx.scene.transform.Rotate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
public class Pentagono extends Forma {
    
        
   public Pentagono(int _posX, int _posY, Color _color, boolean _relleno){
        super(_posX, _posY,new int[5],new int[5],_color,_relleno, 5 );
        
        
    }
       
}
