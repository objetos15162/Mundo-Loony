import greenfoot.*;  

/**
 * Write a description of class Piolin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piolin extends BotonesLo
{
    /**
     * 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            w=new HistoriaPi();
            Greenfoot.setWorld(w);
        }
    }    
}
