import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Siguiente2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Siguiente2 extends Actor
{
    /**
     *Función del comportamiento del boton siguiente
    */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
       {
         World w=getWorld();
         w=new AyudaN3();
         Greenfoot.setWorld(w);
        }
    }    
}
