import greenfoot.*;

/**
 * Write a description of class Fon3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Fon3 extends World
{
     private int jn1;//bandera de perssonaje
    Timer tiempo = new Timer();//bandera de tiempo
    /**
     *(Constructor del fondo de nivel3)
     */
    public Fon3(int jugN1)
    {    
        super(600, 400, 1); 
        jn1=jugN1; 
    }
    
    /**
     * Si pasan ciertos segundos, se cambia al Nivel3 para comenzarlo
     */
    public void act()
    {
    if(tiempo.millisElapsed() >= 4000)
     {
            Nivel3 n3=new Nivel3(jn1);
            Greenfoot.setWorld(n3);    
     }
    }
}
