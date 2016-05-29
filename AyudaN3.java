import greenfoot.*;

/**
 * Write a description of class AyudaN3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AyudaN3 extends World
{
    private RegresarH R;//Variable del boton Regresa
    /**
     * (Constructor de la clase Ayuda del nivel 3)
     */
    public AyudaN3()
    {    
        super(600, 400, 1); 
        R = new RegresarH();
        addObject(R,300,370);
    }
}
