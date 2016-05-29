import greenfoot.*;

/**
 * Write a description of class Manza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manza extends Zanahoria
{
    private int x;
    private int y;
    private int sm;//Variable de velocidad
    
    /**
     * Constructor de la  Manza
    */
    public Manza()
    {
      sm=Greenfoot.getRandomNumber(3)+1;
    }
    
    /**
     * Función de comportamiento de Manza
     */
    public void act() 
    {
      x=getX();
      y=getY();
      mover();
      Nivel1 w= (Nivel1)getWorld();
       if(this.isTouching(Pato1.class) || this.isTouching(Bugs1.class) || this.isTouching(Piolin1.class) || this.isTouching(Taz1.class))
       {
          w.setScore(20);
          w.setZanahoria(1);
          w.removeObject(this);
       }
       else if(isAtEdge())
       {
           w.removeObject(this);
       }                
    }
    
    /**
     * Función de movimiento de Manza
     */
    public void mover()
    {
        setLocation(x,y+sm);
    }
}
