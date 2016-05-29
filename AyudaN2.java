import greenfoot.*;

/**
 * Write a description of class AyudaN2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AyudaN2 extends World
{
    private Siguiente2 S2;//Variable del boton Siguiente
    /**
     * (Constructor de la Ayuda del Nivel 2)
     */
    public AyudaN2()
    {    
        super(600, 400, 1); 
        S2 = new Siguiente2();
        addObject(S2,350,370);
    }
}