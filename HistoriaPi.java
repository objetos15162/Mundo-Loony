import greenfoot.*;  
/**
 * Write a description of class HistoriaPi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HistoriaPi extends World
{
    private JugarPi Pi1;//Variable para boton jugar piolin
    private RegresarH R1;//Variable para boton regresar
    public int jugN1;//Bandera de persdonaje
    
    /**
     * Añade los botones e inicializa la bandera de personaje en 0
     */
    public HistoriaPi()
    {    
        super(600, 400, 1); 
        jugN1=0;
        BotonesHisPi();
    }
    
    /**
     * Agrega el boton jugar y regresar al fondo respectivo
     */
     private void BotonesHisPi()
    {
        Pi1=new JugarPi();
        addObject(Pi1,480,360);
        R1=new RegresarH();
        addObject(R1,120,370);
    }
    
    /**
     * Si da clic en el boton de jugar piolin, manda una señal para que se active el proximo fondo
     */
    public void act()
    {
        if(Pi1.click())
        {
            jugN1=4;
            Greenfoot.setWorld(new Fon1(jugN1));
        }
    }
}
