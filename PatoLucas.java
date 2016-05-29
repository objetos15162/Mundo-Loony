import greenfoot.*;

/**
 * Write a description of class Pato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PatoLucas extends BotonesLo
{
    /**
     * Funcion del boton de pato
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            w=new HistoriaP();
            Greenfoot.setWorld(w);
        }
    }    
}
