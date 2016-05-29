import greenfoot.*;

/**
 * Write a description of class GanoB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GanoB extends World
{
    private RegresarH R4;//Variable para boton regresar
    /**
     * Constructor for objects of class GanoB
     */
    public GanoB()
    {    
        super(600, 400, 1); 
        BotonesR4();
    }
    
    /**
     * Agrega el boton regresar
     */
     private void BotonesR4()
    {
        R4=new RegresarH();
        addObject(R4,220,370);
    }
}
