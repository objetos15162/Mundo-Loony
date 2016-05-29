import greenfoot.*;

/**
 * Write a description of class Elmer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elmer extends Enemigos1
{
    private int x;
    private int y;
    private int sl;//Variable de velocidad
    
    /**
     * Constructor de Elmer
     */
    public Elmer()
    {
      sl=Greenfoot.getRandomNumber(3)+1;
    }
    
    /**
     * Función de comportamiento de Elmer
     */
    public void act() 
    {
       x=getX();
       y=getY();
       Nivel1 w= (Nivel1)getWorld();
       if(this.isTouching(Bugs1.class) || this.isTouching(Pato1.class) || this.isTouching(Taz1.class) || this.isTouching(Piolin1.class))
       {
           w.removeObject(this); 
       }
       else if(isAtEdge())
       {
           w.removeObject(this);  
       }                
       mover();
    }
    
    /**
     * Función de movimiento de Elmer
     */
    public void mover()
    {
        setLocation(x,y+sl);
    }
}
