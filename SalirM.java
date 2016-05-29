import greenfoot.*;

/**
 * Write a description of class SalirM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalirM extends BotonesDeMenu
{
    /**
     * Funcion del comportamiento del boton de salir
     */
    public void act() 
    {
       salida();
    }
    
     private void salida()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }  
}
