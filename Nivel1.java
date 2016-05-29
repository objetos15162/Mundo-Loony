import greenfoot.*;
import java.util.Random;

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Nivel1 extends World
{
    public Bugs1 bugs1;//Variable de personaje
    public Pato1 pato1;
    public Taz1 taz1;
    public Piolin1 pi1;
    
    /** Variables de vidas,puntos,nivel etc **/
    private int score;//variable de puntos
    private int contador;//variable de contador
    private int Vidas;//variable de vidas
    private int puntos;//variable de puntos
    private int nivel;//variable de nivel
    private int zanahoria = 0;//variable de zanahoria
    private int jugN1;//bandera de personaje
    private Timer tiempo;//variable de tiempo
    int speedObjetos;//variable de velocidad de objetos
    
    /**Variables de los actores del Nive1**/
    private Zana zana;//Pimero la clase y luego la variable
    private Manza manza;
    private Caram caram;
    private Elmer elmer;
    
    /**Variables de los Mostradores**/
    private Mostrador Barra;
    private Mostrador mensajePuntos;
    private Mostrador mensajeNivel;
    private Mostrador mensajeVidas;
    private Mostrador mensajeZanahoria;
    
   /**
    * Constructor del mundo del nivel 1
    */
    public Nivel1(int jn1)//v, p  pasar v=Vidas
    {
        super(600, 400, 1);
        nivel = 1;
        Vidas = 3;
        score = 0;
        zanahoria = 0;
        puntos = 0;
        if(jn1==1)
         {
           bugs1 = new Bugs1();
           addObject(bugs1, (super.getWidth()/2), (super.getHeight()-45));
         }
        if(jn1==3)
         {
           taz1 = new Taz1();
           addObject(taz1, (super.getWidth()/2), (super.getHeight()-45));
         }
        if(jn1==4)
         {
           pi1 = new Piolin1();
           addObject(pi1, (super.getWidth()/2), (super.getHeight()-45));
         }
        if(jn1==2)
         {
           pato1 = new Pato1();
           addObject(pato1, (super.getWidth()/2), (super.getHeight()-45));
         }    
         
        
        mensajeNivel = new Mostrador("Nivel: ");
        addObject(mensajeNivel,50,20);
        mensajeNivel.setValue(nivel);
       
        mensajePuntos = new Mostrador("Puntos: ");        
         addObject(mensajePuntos,160,20);
        mensajePuntos.setValue(score);

        mensajeVidas = new Mostrador("Vidas: ");        
        addObject(mensajeVidas,270,20);
        mensajeVidas.setValue(score);
        
        mensajeZanahoria = new Mostrador("Zanahorias: ");        
        addObject(mensajeZanahoria,510,20);
        mensajeZanahoria.setValue(zanahoria);
        jugN1=jn1;
        this.setPaintOrder(Mostrador.class); 
        
    }
    
     /**
     * Función para regresar el nivel
     */
    public int getNivel()
    {
        return nivel;
    }
    
    /**
     * Función para aumentar el nivel
     */
    public void setNivel(int nuevoNivel)
    {
        nivel = nuevoNivel;
    }
    
    /**
     * Función para regresar los zanahoria
     */
    public int getZanahoria()
    {
        return zanahoria;
    }
    
    /**
    * Función para aumentar los zanahorias
    */
    public void setZanahoria(int newZanahoria)
    {
       zanahoria = zanahoria + newZanahoria;
    }

    /**
     * Función para regresar el puntos
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * Función para aumentar los puntos
     */
    public void setScore(int nuevo)
    {
        score = score + nuevo;
    }
    
    /**
     * Función para regresar las vidas
     */
     public int getVidas()
    {
        return Vidas;
    }

    /**
     * Función para aumentar las vidas
     */
    public void setVidas(int nuevo)
    {
        Vidas = Vidas + nuevo;
    }
   
    /**
     * Función para crear a zana
     */
    public void creaZana()
    {
        zana = new Zana();
        addObject(zana, Greenfoot.getRandomNumber(90), 80);
    }

     /**
     * Función para crear a Manza
     */
    public void creaManza()
    {
        manza = new Manza();
        addObject(manza, Greenfoot.getRandomNumber(1000)/10, 80);
    }
    
     /**
     * Función para crear a Caram
     */
    public void creaCaram()
    {
        caram = new Caram();
        addObject(caram, Greenfoot.getRandomNumber(1000), 80);
    }
    
     /**
     * Función para crear a Elmer
     */
    public void creaElmer()
    {
        elmer = new Elmer();
        addObject(elmer, Greenfoot.getRandomNumber(900) , 80);
    }
    
    /**
     * Función para crear los objetos
     */
    public void act()
    {    
        mensajePuntos.setValue(score);
        mensajeVidas.setValue(Vidas);
        mensajeZanahoria.setValue(zanahoria);
        mensajeNivel.setValue(nivel);
        if(Vidas!=0)
        {   
            if(Greenfoot.getRandomNumber(4000)<2)
            {
              creaZana();
            }
            if(Greenfoot.getRandomNumber(2000)<2)
            {
              creaManza();
            }
            if(Greenfoot.getRandomNumber(700)<2)
            {
              creaCaram();
            }
            if(Greenfoot.getRandomNumber(1000)<2)
            {        
             creaElmer();
            }
        }
        
        if(zanahoria == 10)
        {
          Greenfoot.setWorld(new Fon2(jugN1));
        }
    }
   
    /**
    * Función que quita Vida
    */
    public void quitaVida()
    {           
       Vidas=Vidas-1;         
    }
}
