import greenfoot.*;

/**
 * Write a description of class Bugs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bugs extends BotonesLo
{
    /**
     * Funcion del boton de bugs
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            w=new HistoriaB();
            Greenfoot.setWorld(w);
        }
    }    
}