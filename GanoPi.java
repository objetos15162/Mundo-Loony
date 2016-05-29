import greenfoot.*;  

/**
 * Write a description of class GanoPi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GanoPi extends World
{
    private RegresarH R3;//Variable para boton regresar
    /**
     * Constructor for objects of class GanoPi.
     */
    public GanoPi()
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
