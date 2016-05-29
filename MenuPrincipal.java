import greenfoot.*;

/**
 * Write a description of class MenuPrincipal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPrincipal extends World
{
    /**
     * (Constructor de la la clase MenuPrincipal) 
     */
    public MenuPrincipal()
    {    
        super(600, 400, 1);
        BotonesM();
    }
    
    /**
     * (Crea en el menu los botones requeridos)
     */
    private void BotonesM()
    {
        TituloM T1=new TituloM();
        addObject(T1,310,65);
        JugarM B1=new JugarM();
        addObject(B1,320,190);
        AyudaM B2=new AyudaM();
        addObject(B2,320,250);
        SalirM B4=new SalirM();
        addObject(B4,320,310);
    }
}
