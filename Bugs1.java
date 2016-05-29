import greenfoot.*;

/**
 * Write a description of class Bugs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bugs1 extends Personajes1
{
   /** Variables para la direccion del jugador **/
    public static int IZQUIERDA = 1; //moverse hacia la izquierda
    public static int DERECHA = 1; //moverrse hacia la derecha
    public static int ARRIBA = 1; //moverse hacia arriba
    public static int ABAJO = 1; //moverse hacia abajo
    private int speed;//velocidad en la que ira el jugador
    private int score; // Puntuacion
    private boolean nivel;
    private boolean nivel2;
    private boolean PresTecla;//Variable de la tecla que presiona
    //private final GreenfootImage imagenPrin = new GreenfootImage("bugs1.png");
    private int x;
    private int y;
    private int p2;//Bandera de perdio
    
    /**
     * Constructor de Bugs
     */
     public Bugs1()
    {
        score=0;
        speed = 4;
        PresTecla = false;
        nivel = false;
        nivel2=false;   
    }
    
    /**
     * Función para mover a Bugs
     */
    public void Mover()
    {
       PresTecla = false;
       if(Greenfoot.isKeyDown("left"))
        {                           
        if(IZQUIERDA<50)
            {
                 PresTecla = true;
                setImage("bugs4.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>50&&IZQUIERDA<100)
            {
                 PresTecla = true;
                setImage("bugs5.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>100&&IZQUIERDA<150)
            {
                 PresTecla = true;
                setImage("bugs6.png");
                setLocation(this.getX()-2,this.getY());
            }
        }
       if(Greenfoot.isKeyDown("right"))
        {
        if(DERECHA<50)
            {
                PresTecla = true;
                setImage("bugs1.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>50&&DERECHA<100)
            {
                 PresTecla = true;
                setImage("bugs2.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>100&&DERECHA<150)
            {
                PresTecla = true;
                setImage("bugs3.png");
                setLocation(this.getX()+2,this.getY());   
            }
        }   
    }
    
    /**
     * Función para mover a Bugs
     */
    public void Mover2()
    {
       PresTecla = false;
       if(Greenfoot.isKeyDown("left"))
        {                           
        if(IZQUIERDA<50)
            {
                 PresTecla = true;
                setImage("bugs4.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>50&&IZQUIERDA<100)
            {
                 PresTecla = true;
                setImage("bugs5.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>100&&IZQUIERDA<150)
            {
                 PresTecla = true;
                setImage("bugs6.png");
                setLocation(this.getX()-2,this.getY());
            }
        }
       if(Greenfoot.isKeyDown("right"))
        {
        if(DERECHA<50)
            {
                PresTecla = true;
                setImage("bugs1.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>50&&DERECHA<100)
            {
                 PresTecla = true;
                setImage("bugs2.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>100&&DERECHA<150)
            {
                PresTecla = true;
                setImage("bugs3.png");
                setLocation(this.getX()+2,this.getY());   
            }
        }   
        if(Greenfoot.isKeyDown("up"))
        {                           
        if(IZQUIERDA<50)
            {
                 PresTecla = true;
                setImage("bugs4.png");
                setLocation(this.getX(),this.getY()-4);
            }
        if(IZQUIERDA>50&&IZQUIERDA<100)
            {
                 PresTecla = true;
                setImage("bugs5.png");
                setLocation(this.getX(),this.getY()-4);
            }
        if(IZQUIERDA>100&&IZQUIERDA<150)
            {
                 PresTecla = true;
                setImage("bugs6.png");
                setLocation(this.getX(),this.getY()-4);
            }
        }
       if(Greenfoot.isKeyDown("down"))
        {
        if(DERECHA<50)
            {
                PresTecla = true;
                setImage("bugs1.png");
                setLocation(this.getX(),this.getY()+4);   
            }
        if(DERECHA>50&&DERECHA<100)
            {
                 PresTecla = true;
                setImage("bugs2.png");
                setLocation(this.getX(),this.getY()+4);   
            }
        if(DERECHA>100&&DERECHA<150)
            {
                PresTecla = true;
                setImage("bugs3.png");
                setLocation(this.getX(),this.getY()+4);   
            }
        }   
    }
     
     /**
     * Función para checar cuando agarra los zanahoria
     */
     public void VerificaZanahoria()
        {
            if(this.isTouching(Zana.class)||this.isTouching(Caram.class)||this.isTouching(Manza.class))
            {
                ((Nivel1)getWorld()).setZanahoria(1);
                if(this.isTouching(Zana.class)) 
                    removeTouching(Zana.class);
                if(this.isTouching(Caram.class)) 
                    removeTouching(Caram.class);
                if(this.isTouching(Manza.class)) 
                    removeTouching(Manza.class);
            }
        } 
        
     /**
     * Comportamiento de Bugs
     */
    public void act() 
    { 
        try
      {
          if (((Nivel1)getWorld()).getNivel() == 1)
          {
          Mover();
          VerificaVidas();
          VerificaZanahoria();
          VerificaMuerte();
        }
      }
        catch (Exception e) //(((Nivel2)getWorld()).getNivel() == 2)
      {
          try
          {
              if(((Nivel2)getWorld()).getNivel() == 2)
              {
                  Mover();
                VerificaVidas2();
                VerificaAgua(); 
                VerificaMuerte();
              }
          }
          catch (Exception g)
          {
              Mover2();
           VerificaVidas3();
           VerificaMuerte();
           VerificaMonedas();
           VerificaGana();
          }
      }
      //if(PresTecla == false)
     //this.setImage(imagenPrin);  
     finally
      {
      if(IZQUIERDA==150) IZQUIERDA=1;
       IZQUIERDA++;
      if(DERECHA==150) DERECHA=1;
       DERECHA++;
      if(ARRIBA==150) ARRIBA=1;
       ARRIBA++;
      if(ABAJO==150) ABAJO=1;
       ABAJO++;
      }
    }
        
   /**
    * Función que quita vida, si se topa con Elmer
    */
      public void VerificaVidas()
    {
        if(this.isTouching(Elmer.class))
        {
          ((Nivel1)getWorld()).setVidas(-1);  
        }
    }   
    
    /**
     * Función que checa las vidas que se van quitando, cuando le tocan
     */
    public void VerificaVidas2()
    {
        if(this.isTouching(Coyote.class)||this.isTouching(Sam.class)||this.isTouching(Tnt.class))
        {
            ((Nivel2)getWorld()).setVidas(-1);  
        }
    }  
    
    /**
     * Funcion que verifica la Agua que encontro
     */
     public void VerificaAgua()
        {
            if(this.isTouching(Agua.class)||this.isTouching(Corre.class))
            {
                ((Nivel2)getWorld()).setAgua(1);
                if(this.isTouching(Agua.class)) 
                removeTouching(Agua.class);
                if(this.isTouching(Corre.class)) 
                 removeTouching(Corre.class);
            }
        } 
        
           /**
     * Funcion que verifica las monedas que encontro
     */
     public void VerificaMonedas()
     {
       if(this.isTouching(Moneda.class))
       {
         ((Nivel3)getWorld()).setMonedas(1);
         if(this.isTouching(Moneda.class)) 
         removeTouching(Moneda.class);
       }
     } 
     
     public void VerificaGana()
    {
      if(((Nivel3)getWorld()).getMonedas() == 15) 
      {
       GanoP g2=new GanoP();
       Greenfoot.setWorld(g2);    
      }
    } 
    
     /**
     * Función que Verifica si le quitaron una vida
     */
    public void VerificaVidas3()
    {
        if(this.isTouching(Silvestre.class)||this.isTouching(Demonio.class))
        {
            ((Nivel3)getWorld()).setVidas(-1);  
        }
    } 
    
     public void VerificaMuerte()
    {
       try
      {
          if (((Nivel1)getWorld()).getVidas() == 0)
          {
          PerdioB b1=new PerdioB( );
          Greenfoot.setWorld(b1);   
          }
      }
        catch (Exception e) //(((Nivel2)getWorld()).getNivel() == 2)
      {
          try
          {
              if(((Nivel2)getWorld()).getVidas() == 0)
              {
                PerdioB b1=new PerdioB( );
                Greenfoot.setWorld(b1);   
              }
          }
          catch (Exception g)
          {
           if(((Nivel3)getWorld()).getVidas() == 0) 
            {
            PerdioB b1=new PerdioB( );
            Greenfoot.setWorld(b1);    
            }
          }
      }
    } 
}
