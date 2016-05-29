import greenfoot.*;

/**
 * Write a description of class RegresarH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegresarH extends BotonesDeHistoria
{
    /**
     * Función del comportamiento del boton regresar
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            w=new MenuPrincipal();
            Greenfoot.setWorld(w);
        }
    }    
}
