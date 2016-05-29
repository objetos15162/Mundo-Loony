import greenfoot.*;

/**
 * Write a description of class HistoriaB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HistoriaB extends World
{
    /**
    *(Constructor de la clase Historia de Bugs)
    */
    private JugarB B1;//Variable para boton jugar bugs
    private RegresarH R1;//Variable para boton regresar
    public int jugN1;//Bandera de princesa
    
    /**
     * Añade los botones e inicializa la bandera de personaje en 0
     */
    public HistoriaB()
    {    
        super(600, 400, 1); 
        jugN1=0;
        BotonesHisB();
    }
    
    /**
     * Agrega el boton jugar y regresar al fondo respectivo
     */
     private void BotonesHisB()
    {
        B1=new JugarB();
        addObject(B1,480,360);
        R1=new RegresarH();
        addObject(R1,120,370);
    }
    
    /**
     * Si da clic en el boton de jugar bugs, manda una señal para que se active el proximo fondo
     */
    public void act()
    {
        if(B1.click())
        {
            jugN1=1;
            Greenfoot.setWorld(new Fon1(jugN1));
        }
    }
}