import greenfoot.*;

/**
 * Write a description of class HistoriaP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HistoriaP extends World
{
   
    /**
     * (Constructor de la clase Historia de Pato)
     */
    private JugarP P1;
    private RegresarH R1;
    public int jugN1;//Bandera del jugador que escoja
    
    /**
     * Añade los botones e inicializa la bandera de jugador en 0
     */
    public HistoriaP()
    {    
         super(600, 400, 1); 
         jugN1=0;
         BotonesHisP();
    }
    
    /**
     * Agrega el boton jugar y regresar al fondo respectivo
     */
     private void BotonesHisP()
    {
        P1= new JugarP();
        addObject(P1,480,375);
        R1=new RegresarH();
        addObject(R1,180,375);
    }
    
    /**
     * Si da clic en el boton de jugar pato, manda una señal para que se active el proximo fondo
     */
    public void act()
    {
        if(P1.click())
        {
            jugN1=2;
            Greenfoot.setWorld(new Fon1(jugN1));
        }
    } 
}