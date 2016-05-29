import greenfoot.*;

/**
 * Write a description of class Fon1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fon1 extends World
{
   private int jn1;//bandera de personaje
   Timer tiempo = new Timer();//Variable del tiempo
   
    /**
     *(Constructor de la clase Fon1)
     */  
    public Fon1(int jugN1)
    {    
        super(600, 400, 1); 
        jn1=jugN1;
    }
    
    /**
     * Si pasan ciertos segundos, se cambia al Nivel1 para comenzarlo
     */
    public void act()
    {
        if(tiempo.millisElapsed() >= 4000)
        {
            Nivel1 n1=new Nivel1(jn1);
            Greenfoot.setWorld(n1);    
        }
    }
}
