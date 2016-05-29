import greenfoot.*;  

/**
 * Write a description of class Taz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taz extends BotonesLo
{
    /**
     * 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            w=new HistoriaT();
            Greenfoot.setWorld(w);
        }
    }    
}
