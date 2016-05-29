import greenfoot.*;

/**
 * Write a description of class Zanahoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zana extends Zanahoria
{
    private int x;
    private int y;
    private int sg;//Variable  de Velocidad
    
    /**
     * Constructor dela zanahoria
     */
    public Zana()
    {
      sg=Greenfoot.getRandomNumber(3)+1;
    }
    
    /**
     * Función de comportamiento de la zanahoria
     */
    public void act() 
    {
       x=getX();
       y=getY();
       mover();
       Nivel1 w= (Nivel1)getWorld();
      if(this.isTouching(Bugs1.class) || this.isTouching(Pato1.class) || this.isTouching(Piolin1.class) || this.isTouching(Taz1.class))
       {
          w.setScore(10);
          w.setZanahoria(1);
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
        setLocation(x,y+sg);
    }
}
