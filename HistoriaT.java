import greenfoot.*;

/**
 * Write a description of class HistoriaT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HistoriaT extends World
{
    private JugarT T1;//Variable para boton jugar Taz
    private RegresarH R1;//Variable para boton regresar
    public int jugN1;//Bandera de personaje
    
    /**
     * Añade los botones e inicializa la bandera de persoanje en 0
     */
    public HistoriaT()
    {    
        super(600, 400, 1); 
        jugN1=0;
        BotonesHisT();
    }
    
    /**
     * Agrega el boton jugar y regresar al fondo respectivo
     */
     private void BotonesHisT()
    {
        T1=new JugarT();
        addObject(T1,480,360);
        R1=new RegresarH();
        addObject(R1,120,370);
    }
    
    /**
     * Si da clic en el boton de jugar taz, manda una señal para que se active el proximo fondo
     */
    public void act()
    {
        if(T1.click())
        {
            jugN1=3;
            Greenfoot.setWorld(new Fon1(jugN1));
        }
    }
}
