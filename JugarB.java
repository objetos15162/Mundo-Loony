import greenfoot.*;

/**
 * Write a description of class JugarCen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JugarB extends BotonesDeHistoria
{
   
    /**
     * 
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    /**
     * Función para guarde cuando le de clic el jugador al boton jugar de bugs
     */
    public boolean click()
    {
        boolean click = false;
        if(Greenfoot.mouseClicked(this))
        {
          click = true;
        }
        return click;
    } 
}
