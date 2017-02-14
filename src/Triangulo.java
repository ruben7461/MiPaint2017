
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
public class Triangulo extends Forma{
    
      
    Color color = null;
   
    boolean relleno = false;
    
    public Triangulo(int _posX, int _posY, Color _color, boolean _relleno){
        super(_posX, _posY,new int[3],new int[3],_color,_relleno, 3 );
        
    }
}



//ANTIGUO CONSTRUCTOR

  //creamos el constructor
//    public Triangulo ( int _posX, int _posY, int _lado, Color _color, boolean _relleno) {
//        
//        //inidicamos el numero de puntos que tiene el poligono
//       this.npoints = 3;
//       
//       int altura = 40;
//       //le damos la posX al primer numero del array 
//       this.xpoints[0] = _posX;
//       this.ypoints[0] = _posY;
//       //le damos la posX al segundo numero del array 
//       
//        this.ypoints[1] = _posY + altura;
//        
//       //le damos la posX al tercer numero del array 
//        this.ypoints[2] = _posY + altura;
//       
//       
//        
//        //creamos la formula
//        int mediaBase = (int) (altura / Math.sin(Math.toRadians(60)));
//        
//         this.xpoints[1] = _posX + mediaBase;
//         this.xpoints[2] = _posX - mediaBase;
//         
//     
//     
//        this.color = _color;
//        this.relleno = _relleno;
//        
//        
//    }
//    
//    
// 
//    
//     public void dibujate(Graphics2D g2, int posY){
//        
//         int altura = Math.abs((int) ypoints[0] - posY);
//        this.ypoints[1] = posY + altura;
//        this.ypoints[2] = posY + altura;
//        int mediaBase = (int) (altura / Math.sin(Math.toRadians(60))) ;
//        this.xpoints[1] = this.xpoints[0] + mediaBase;
//        this.xpoints[2] = this.xpoints[0] - mediaBase;
//        
//        g2.setColor(color);
//        
//        if(relleno){
//            g2.fill(this);
//        }
//        else{
//            g2.draw(this);
//        }
//        
//    }

