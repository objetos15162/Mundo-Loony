import greenfoot.*;

/**
 * Write a description of class AyudaM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AyudaM extends BotonesDeMenu
{
   
    /**
     * Funcion del comportamiento del boton de ayuda
     */
     public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
           World w=getWorld();
           w=new AyudaN1();
           Greenfoot.setWorld(w);
        }
    }    
}
