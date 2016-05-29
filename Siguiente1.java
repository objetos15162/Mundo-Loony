import greenfoot.*;

/**
 * Write a description of class Siguiente1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Siguiente1 extends Actor
{
    /**
    * Función del comportamiento del boton siguiente
    */
    public void act() 
    {
    if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            w=new AyudaN2();
            Greenfoot.setWorld(w);
        }
    }
}
