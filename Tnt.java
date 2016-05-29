import greenfoot.*; 

/**
 * Write a description of class Tnt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tnt extends Actor
{
    private int x;
    private int y;
    private int sm;//Variable de Velocidad
    
    /**
     * Constructor de Coyote
     */
    public Tnt()
    {
      sm=Greenfoot.getRandomNumber(3)+1;
    }
    
    /**
     * Función del comportamiento de tnt
     */
    public void act() 
    
    {
       x=getX();
       y=getY();
       mover();
       Nivel2 w= (Nivel2)getWorld();
      if(this.isTouching(Bugs1.class) || this.isTouching(Pato1.class) || this.isTouching(Piolin1.class) || this.isTouching(Taz1.class))
       {
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
        setLocation(x,y+sm);
    }
}
