import greenfoot.*;

/**
 * Write a description of class Corre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Corre extends Actor
{
    private int x;
    private int y;
    private int ss;//Variable de Velocidad
    
     /**
     * Constructor del amigo Corre
     */
    public Corre()
    {
      ss=Greenfoot.getRandomNumber(1)+1;
    }
    
    /**
     * Función del comportamiento deCorre
     */
    public void act() 
    {
       x=getX();
       y=getY();
       mover();
       Nivel2 w= (Nivel2)getWorld();
      if(this.isTouching(Bugs1.class) || this.isTouching(Pato1.class) || this.isTouching(Piolin1.class) || this.isTouching(Taz1.class))
       {
         w.setScore(30);
        
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
        setLocation(x,y+ss);
    }
}    

