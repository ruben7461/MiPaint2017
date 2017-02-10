
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
public class Hexagono extends Polygon {
     Color color = null;
   
    boolean relleno = false;
    
    int x = 0;
    int y = 0;
    
    
    
    
   public Hexagono (int _posX, int _posY, int [] _puntosX, int [] _puntosY, int _altura, Color _color, boolean _relleno){
        super(_puntosX, _puntosY, 6);
        this.x = _posX;
        this.y = _posY;
        calculaVertices(1);
        this.color = _color;
        this.relleno = _relleno;
        
        
    }
    
    
 
    
     public void dibujate(Graphics2D g2, int posY){
        
        
        int radio =  this.y - posY;

         calculaVertices(radio);
        
        g2.setColor(color);
        
        if(relleno){
            g2.fill(this);
        }
        else{
            g2.draw(this);
        }
        
    }
     
     private void calculaVertices(int _radio){
         
         for (int i=0; i<6; i++){
            this.xpoints[i] = (int) ( this.x + _radio*Math.cos(2*Math.PI*i/npoints));
            this.ypoints[i] = (int) ( this.y + _radio*Math.sin(2*Math.PI*i/npoints));
       
        }
        
         
     }
}
