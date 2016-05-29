import greenfoot.*;

/**
 * Write a description of class Fon2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fon2 extends World
{   
      private int jn1;//bandera de personaje
     Timer tiempo = new Timer();
     
    /**
     * (Constructor de la clase de Fon2)
     */
    public Fon2(int jugN1)
    {    
        super(600, 400, 1);
        jn1=jugN1; 
    }
    
    /**
      Si pasan ciertos segundos, se cambia al Nivel2 para comenzarlo
     */
    public void act()
    {
        
    if(tiempo.millisElapsed() >= 4000)
     {
            Nivel2 n2=new Nivel2(jn1);
            Greenfoot.setWorld(n2);    
     }
    }
}
