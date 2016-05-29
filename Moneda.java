import greenfoot.*;

/**
 * Write a description of class Moneda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moneda extends Actor
{
    /**
     * Funcion del comportamiento de la moneda
     */
    public void act() 
    {
      Nivel3 w= (Nivel3)getWorld();
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
}