import greenfoot.*;

/**
 * Write a description of class sam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sam extends Enemigos2
{
    private int x;
    private int y;
    private int su;//Variable de velocidad
    
    /**
     * Constructor de Ursula
     */
    public Sam()
    {
      su=Greenfoot.getRandomNumber(4)+1;
    }
    
    /**
     * Función del comportamiento de Sam
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
        setLocation(x,y+su);
    } 
}    

