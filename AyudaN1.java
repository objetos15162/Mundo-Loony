import greenfoot.*;

/**
 * Write a description of class AyudaN1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AyudaN1 extends World
{
    private Siguiente1 S1;//Variable del boton Siguiente
    /**
     * Constructor de la clase ayuda del nivel1)
     */
    public AyudaN1()
    {    
        super(600, 400, 1); 
        S1 = new Siguiente1();
        addObject(S1,150,370);
    }
}
