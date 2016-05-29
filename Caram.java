import greenfoot.*;

/**
 * Write a description of class Caram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Caram extends Zanahoria
{
    private int x;
    private int y;
    private int sj;//Variable de velocidad
   
    /**
     * Constructor del Caram
     */
    public Caram()
    {
      sj=Greenfoot.getRandomNumber(3)+1;
    }
    
    /**
     * Función de comportamiento de Caram
     */
    public void act() 
    {
       x=getX();
       y=getY();
       mover();
       Nivel1 w= (Nivel1)getWorld();
       if(this.isTouching(Bugs1.class) || this.isTouching(Pato1.class) || this.isTouching(Piolin1.class) || this.isTouching(Taz1.class))
       {
           w.setScore(50);
           w.setZanahoria(1);
           w.removeObject(this);
       }
       else if(isAtEdge())
       {
           w.removeObject(this);  
       }                
    }
    
    /**
     * Función de movimiento de Caram
     */
    public void mover()
    {
     setLocation(x+sj,y+sj);
    }
    
   }
