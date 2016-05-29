import greenfoot.*;

/**
 * Write a description of class MenuJugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuJ extends World
{

    /**
     * Constructor de la clase Menu Jugador)
     */
    public MenuJ()
    {    
        super(600, 400, 1);
        BotonesLo();
    }
    
    /**
     *Función que añade los botones de los jugadores 
     */
    private void BotonesLo()
    {
        PatoLucas EP2=new PatoLucas();
        addObject(EP2,450,340);
        Bugs EP3=new Bugs();
        addObject(EP3,150,340);
        Taz EP4=new Taz();
        addObject(EP4,450,140);
        Piolin EP5=new Piolin();
        addObject(EP5,150,140);
    }
}