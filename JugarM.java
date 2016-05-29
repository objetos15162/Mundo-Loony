import greenfoot.*;

/**
 * Write a description of class JugarM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JugarM extends BotonesDeMenu
{
    /**
     * Función del comportamiento del boton de jugar
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            w=new MenuJ();
            Greenfoot.setWorld(w);
        }
    }    
}
