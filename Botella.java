import greenfoot.*;

/**
 * Write a description of class Botella here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botella extends Agua
{
    private int x;
    private int y;
    private int sd;//Variable de velocidad
    
    /**
     * Constructor de la clase de botella
     */
    public Botella()
    {
      sd=Greenfoot.getRandomNumber(2)+1;
    }
    
    /**
     * Función del comportamiento del botella
     */
    public void act() 
    {
      x=getX();
      y=getY();
      mover();
      Nivel2 w= (Nivel2)getWorld();
      if(this.isTouching(Pato1.class) || this.isTouching(Bugs1.class) || this.isTouching(Piolin1.class) || this.isTouching(Taz1.class))
       {
         w.setScore(10);
         w.setAgua(1);
         w.removeObject(this);
       }
       else if(isAtEdge())
       {
         w.removeObject(this); 
       }                
     }
    
    /**
     * Función de movimiento 
     */
    public void mover()
    {
       setLocation(x,y+sd);
    }
   }    
