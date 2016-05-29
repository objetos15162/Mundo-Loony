import greenfoot.*;

/**
 * Write a description of class PerdioB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PerdioB extends World
{
    private RegresarH R2;//Variable para boton regresar
    /**
     * Constructor for objects of class PerdioB.
     */
    public PerdioB()
    {    
        super(600, 400, 1); 
        BotonesR2();
    }
    
    /**
     * Agrega el boton regresar
     */
     private void BotonesR2()
    {
        R2=new RegresarH();
        addObject(R2,300,370);
    }
}
