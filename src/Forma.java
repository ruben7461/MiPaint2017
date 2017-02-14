
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;


/*
La clase forma es la clase comun a todos los objetos graficos que 
estamos creando.
contiene los metodos comunes de pintado y de calculo de posicion de los vertices
y las propiedades comunes de todos los objetos graficos que estamos creando:
el color,el relleno,la posicion x e y y el numero de veces
*/
public class Forma extends Polygon{
     Color color = null;
   
    boolean relleno = false;
    
    int x = 0;
    int y = 0;
    int numLados;
    
    
    
   public Forma (int _posX, int _posY, int [] _puntosX, int [] _puntosY, Color _color, boolean _relleno,int _numLados){
        super (_puntosX, _puntosY, _numLados);
        numLados = _numLados;
        this.x = _posX;
        this.y = _posY;
        calculaVertices(1, 0);
        this.color = _color;
        this.relleno = _relleno;
        
        
    }
    
    
 
    
     public void dibujate(Graphics2D g2, int posX , int posY){
        
        
        int radio =  this.y - posY;
        int giro = this.x - posX / 10;

         calculaVertices(radio, giro);
        
        g2.setColor(color);
        
        if(relleno){
            g2.fill(this);
        }
        else{
            g2.draw(this);
        }
        
    }
     
     public void calculaVertices(int _radio, double _giro){
         
         for (int i=0; i < numLados; i++){
            this.xpoints[i] = (int) ( this.x + _radio * Math.cos((2 * Math.PI * i + _giro )/ npoints ));
            this.ypoints[i] = (int) ( this.y + _radio * Math.sin((2 * Math.PI* i + _giro )/ npoints ));
       
        }
        
         
     }
    
}
