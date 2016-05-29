import greenfoot.*;

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends World
{
    
    public Pato1 pato3;//Variable de personaje
    public Bugs1 bugs3; 
    public Taz1 taz3; 
    public Piolin1 piolin3; 
    
    /** Variables de vidas,puntos,nivel etc **/
    private int score;//variable de puntos
    private int Vidas;//variable de vidas
    private int puntos;//variable de puntos
    private int nivel;//variable de nivel
    private int monedas = 0;//variable de moneda
    int speedObjetos;//variable de velocidad de objetos
    private Timer tiempo;//variable de tiempo
    private int jugN1;//bandera de personaje
    
    /**Variables de los actores del Nive3**/
    private Silvestre silvestre;//Pimero la clase y luego la variable
    private Demonio demonio;
    private Porky porky;
    private Moneda moneda;
    
    /**Variables de los Counters **/
    private Mostrador Barra;
    private Mostrador mensajePuntos;
    private Mostrador mensajeNivel;
    private Mostrador mensajeVidas;
    private Mostrador mensajeMonedas;
    
    /**
     * (Constructor de la clase de Nivel3)
     */
    public Nivel3(int jn1)
    {    
        super(600, 400, 1); 
        nivel = 3;
        Vidas = 3;
        score = 0;
        monedas = 0;
        puntos = 0;
         if(jn1==2)
        {
         pato3 =new Pato1();
         addObject(pato3, 50, 300);
        }
        if(jn1==1) 
        {
         bugs3 =new Bugs1();
         addObject(bugs3,  50, 300);
        }   
        if(jn1==3)
        {
         taz3 =new Taz1();
         addObject(taz3, 50, 300);
        }
        if(jn1==4) 
        {
         piolin3 =new Piolin1();
         addObject(piolin3,  50, 300);
        }   
        
        LlenaMundo3();
        
        mensajeNivel = new Mostrador("Nivel: ");
        addObject(mensajeNivel,50,20);
        mensajeNivel.setValue(nivel);
       
        mensajePuntos = new Mostrador("Puntos: ");        
        addObject(mensajePuntos,160,20);
        mensajePuntos.setValue(score);

        mensajeVidas = new Mostrador("Vidas: ");        
        addObject(mensajeVidas,270,20);
        mensajeVidas.setValue(score);
        
        mensajeMonedas= new Mostrador("Monedas ");        
        addObject(mensajeMonedas,510,20);
        mensajeMonedas.setValue(monedas);
       
        this.setPaintOrder(Mostrador.class);
    }
    
    public void LlenaMundo3()
    {

        Barra b = new Barra();
        addObject(b, 180, 300);
        
        Barra b1 = new Barra();
        addObject(b1, 300, 150);
        
        Barra b2 = new Barra();
        addObject(b2, 490, 305);
        
        Silvestre e = new Silvestre();
        addObject(e, 130, 250);
         
        Demonio e1 = new Demonio();
        addObject(e1, 230, 100);
         
        Porky e2 = new Porky();
        addObject(e2, 540, 250);
        
        Moneda m1 = new Moneda();
        addObject(m1, 170, 350);
         
        Moneda m2 = new Moneda();
        addObject(m2, 105, 260);
         
        Moneda m3 = new Moneda();
        addObject(m3, 130, 320);
         
        Moneda m4 = new Moneda();
        addObject(m4, 150, 120);
        
        Moneda m5 = new Moneda();
        addObject(m5, 180, 50);
         
        Moneda m6 = new Moneda();
        addObject(m6, 220, 260);
         
        Moneda m7 = new Moneda();
        addObject(m7, 300, 320);
         
        Moneda m8 = new Moneda();
        addObject(m8, 340, 120);
        
        Moneda m9 = new Moneda();
        addObject(m9, 350, 50);
         
        Moneda m10 = new Moneda();
        addObject(m10, 400, 260);
         
        Moneda m11 = new Moneda();
        addObject(m11, 430, 320);
         
        Moneda m12 = new Moneda();
        addObject(m12, 440, 120);
        
        Moneda m13 = new Moneda();
        addObject(m13, 450, 50);
         
        Moneda m14 = new Moneda();
        addObject(m14, 470, 260);
         
        Moneda m15 = new Moneda();
        addObject(m15, 490, 320);
        
        Moneda m16 = new Moneda();
        addObject(m16, 460, 210);
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
     * Función para aumentar las monedas que esta encontrando
     */
    public void setMonedas(int newMoneda)
    {
        monedas = monedas + newMoneda;
    }
    
    /**
     * Función para regresar el numero de monedas
     */
    public int getMonedas()
    {
        return monedas;
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
     * Función que crea los enemigos y objetos del mundo del nivel 2
     */
    public void act()
    {
        mensajePuntos.setValue(score);
        mensajeVidas.setValue(Vidas);
        mensajeMonedas.setValue(monedas);
        mensajeNivel.setValue(nivel);
    }
    
   /**
   * Función que quita vida
   */
    public void quitaVida()
    {           
       Vidas=Vidas-1;         
    }
}
