import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JugarPi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JugarPi extends BotonesDeHistoria
{
    /**
     * 
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * Función para guarde cuando le de clic el jugador al boton jugar de piolin
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
