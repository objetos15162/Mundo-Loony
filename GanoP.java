import greenfoot.*;

/**
 * Write a description of class GanoP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GanoP extends World
{
    private RegresarH R3;//Variable para boton regresar
    /**
     * Constructor for objects of class GanoP.
     */
    public GanoP()
    {    
        super(600, 400, 1); 
        BotonesR3();
    }
    
    /**
     * Agrega el boton regresar
     */
     private void BotonesR3()
    {
        R3=new RegresarH();
        addObject(R3,220,370);
    }
}
