import greenfoot.*;
import java.util.Random;

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{
    public Bugs1 bugs2;//Variable de personaje
    public Pato1 pato2;
    public Piolin1 piolin2;
    public Taz1 taz2;
      
    /** Variables de vidas,puntos,nivel etc **/
    private int score;//variable de puntos
    private int Vidas;//variable de vidas
    private int puntos;//variable de puntos
    private int nivel;//variable de nivel
    private int agua = 0;//variable de agua
    private int jugN1;//bandera de personaje
    int speedObjetos;//variable de velocidad de objetos
    private Timer tiempo;//variable de tiempo
    
    /**Variables de los actores del Nive2**/
    private Sam sam;//Pimero la clase y luego la variable
    private Coyote coyote;
    private Corre corre;
    private Botella botella;
    private Tnt tnt;
    
    /**Variables de los Mostradores **/
    private Mostrador Barra;
    private Mostrador mensajePuntos;
    private Mostrador mensajeNivel;
    private Mostrador mensajeVidas;
    private Mostrador mensajeAgua;
    
    /**
     * Constructor del Nivel 2, agregandole ya los letreros y el mundo
     */
    public Nivel2(int jn1)
    {    
        super(600, 400, 1);
        /** Inicializacion de variables nuevas**/
        nivel = 2;
        agua = 0;
        Vidas = 5;
       if(jn1==1)
        {
         bugs2 =new Bugs1();
         addObject(bugs2, (super.getWidth()/2), (super.getHeight()-45));
        }
       if(jn1==2)
        {
          pato2 =new Pato1();
          addObject(pato2, (super.getWidth()/2), (super.getHeight()-45));
        }    
       if(jn1==3)
        {
         taz2 =new Taz1();
         addObject(taz2, (super.getWidth()/2), (super.getHeight()-45));
        }
       if(jn1==4)
        {
          piolin2 =new Piolin1();
          addObject(piolin2, (super.getWidth()/2), (super.getHeight()-45));
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
        
        mensajeAgua = new Mostrador("Agua: ");        
        addObject(mensajeAgua,510,20);
        mensajeAgua.setValue(agua);
       
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
     * Función para aumentar nivel
     */
    public void setNivel(int nuevoNivel)
    {
        nivel = nuevoNivel;
    }
    
    /**
     * Función para aumentar las agua que esta encontrando
     */
    public void setAgua(int newAgua)
    {
        agua = agua + newAgua;
    }
    
    /**
     * Función para regresar el numero de agua
     */
    public int getAgua()
    {
        return agua;
    }

    /**
     * Función para regresar los puntos
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
     * Función para regresar las vidad
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
     * Función para crear a Sam
     */
    public void creaSam()
    {
        sam = new Sam();
        addObject(sam, Greenfoot.getRandomNumber(2000), 80);
    }

    /**
     * Función para crear a Coyote
     */
    public void creaCoyote()
    {
        coyote = new Coyote();
        addObject(coyote, Greenfoot.getRandomNumber(3000), 80);
    }
    
    /**
     * Función para crear a corre
     */
    public void creaCorre()
    {
        corre= new Corre();
        addObject(corre, Greenfoot.getRandomNumber(4000), 80);
    }
    
    /**
     * Función para crear la agua
     */
    public void creaAgua()
    {
        botella = new Botella();
        addObject(botella, Greenfoot.getRandomNumber(2500), 80);
    }
  
    /**
     * Función para crear losa zapatos
     */
    public void creaTnt()
    {
        tnt = new Tnt();
        addObject(tnt, Greenfoot.getRandomNumber(500), 80);
    }
    
    /**
     * Función que crea los enemigos y objetos del mundo del nivel 2
     */
    public void act()
    {
        mensajePuntos.setValue(score);
        mensajeVidas.setValue(Vidas);
        mensajeAgua.setValue(agua);
        mensajeNivel.setValue(nivel);
        if(Vidas!=0)
        {    
            if(Greenfoot.getRandomNumber(4000)<2)
            {
              creaSam(); 
            }  
            if(Greenfoot.getRandomNumber(2000)<2)
            {
              creaCoyote();
            }
            if(Greenfoot.getRandomNumber(2000)<2)
            {
              creaTnt();
            }
            if(Greenfoot.getRandomNumber(700)<2)
            {     
              creaCorre();
            }
            if(Greenfoot.getRandomNumber(1000)<2)
            {       
               creaAgua();
            }
        }
        
        if(agua == 10)
        {
            Greenfoot.setWorld(new Fon3(jugN1));
        }
    }
    
  /**
   * Función que quita vida
   */
    public void quitaVida()
    {           
       Vidas=Vidas-1;         
    }

}

     
    
