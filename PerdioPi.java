import greenfoot.*; 
/**
 * Write a description of class PerdioPi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PerdioPi extends World
{
 private RegresarH R1;//Variable para boton regresar
    /**
     * Constructor for objects of class PerdioPi.
     */
    public PerdioPi()
    {    
        super(600, 400, 1); 
        BotonesR1();
    }
    
    /**
     * Agrega el boton regresar
     */
     private void BotonesR1()
    {
        R1=new RegresarH();
        addObject(R1,220,370);
    }
}
