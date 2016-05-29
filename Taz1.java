import greenfoot.*;  

/**
 * Write a description of class Taz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taz1 extends Personajes1
{
    public static int IZQUIERDA = 1; //moverse hacia la izquierda
    public static int DERECHA = 1; //moverrse hacia la derecha
    public static int ARRIBA = 1; //moverse hacia arriba
    public static int ABAJO = 1; //moverse hacia abajo
    private int speed;//velocidad en la que ira el jugador
    private int score; // Putuacion
    private boolean nivel;
    private boolean nivel2;
    private boolean PresTecla;//Variable de la tecla que presione
    //private final GreenfootImage imagenPrin = new GreenfootImage("taz1.png");
    private int p3;//bandera de perdio
    
    /**
     * Constructor de taz1
     */
     public Taz1()
    {
        score=0;
        speed = 4;
        PresTecla = false;
        nivel = false;
        nivel2=false;   
    }
    
    /**
     * Función para mover a taz
     */
    public void Mover()
    {
       PresTecla = false;
       if(Greenfoot.isKeyDown("left"))
        {                           
        if(IZQUIERDA<40)
            {
                 PresTecla = true;
                setImage("taz1.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>40&&IZQUIERDA<80)
            {
                 PresTecla = true;
                setImage("taz2.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>80&&IZQUIERDA<120)
            {
                 PresTecla = true;  
                setImage("taz3.png");
                setLocation(this.getX()-2,this.getY());
           }
        if(IZQUIERDA>120&&IZQUIERDA<160)
            {
                 PresTecla = true;
                setImage("taz4.png");
                setLocation(this.getX()-2,this.getY());
            
            }
        }
       if(Greenfoot.isKeyDown("right"))
        {
        if(DERECHA<40)
            {
                PresTecla = true;
                setImage("taz1.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>40&&DERECHA<80)
            {
                 PresTecla = true;
                setImage("taz5.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>80&&DERECHA<120)
            {
                PresTecla = true;
                setImage("taz6.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>120&&DERECHA<160)
            {
                PresTecla = true;
                setImage("taz4.png");
                setLocation(this.getX()+2,this.getY());   
            }
        }   
      } 
      
      /**
     * Función para mover a taz
     */
    public void Mover2()
    {
       PresTecla = false;
       if(Greenfoot.isKeyDown("left"))
        {                           
        if(IZQUIERDA<40)
            {
                 PresTecla = true;
                setImage("taz1.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>40&&IZQUIERDA<80)
            {
                 PresTecla = true;
                setImage("taz2.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>80&&IZQUIERDA<120)
            {
                 PresTecla = true;  
                setImage("taz3.png");
                setLocation(this.getX()-2,this.getY());
           }
        if(IZQUIERDA>120&&IZQUIERDA<160)
            {
                 PresTecla = true;
                setImage("taz4.png");
                setLocation(this.getX()-2,this.getY());
            
            }
        }
       if(Greenfoot.isKeyDown("right"))
        {
        if(DERECHA<40)
            {
                PresTecla = true;
                setImage("taz1.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>40&&DERECHA<80)
            {
                 PresTecla = true;
                setImage("taz5.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>80&&DERECHA<120)
            {
                PresTecla = true;
                setImage("taz6.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>120&&DERECHA<160)
            {
                PresTecla = true;
                setImage("taz4.png");
                setLocation(this.getX()+2,this.getY());   
            }
        }   
       if(Greenfoot.isKeyDown("up"))
        {                           
        if(IZQUIERDA<40)
            {
                 PresTecla = true;
                setImage("taz1.png");
                setLocation(this.getX(),this.getY()-4);
            }
        if(IZQUIERDA>40&&IZQUIERDA<80)
            {
                 PresTecla = true;
                setImage("taz2.png");
                setLocation(this.getX(),this.getY()-4);
            }
        if(IZQUIERDA>80&&IZQUIERDA<120)
            {
                 PresTecla = true;  
                setImage("taz3.png");
                setLocation(this.getX(),this.getY()-4);
           }
        if(IZQUIERDA>120&&IZQUIERDA<160)
            {
                 PresTecla = true;
                setImage("taz4.png");
                setLocation(this.getX(),this.getY()-4);
            }
        }
       if(Greenfoot.isKeyDown("down"))
        {
        if(DERECHA<40)
            {
                PresTecla = true;
                setImage("taz1.png");
                setLocation(this.getX(),this.getY()+4);   
            }
        if(DERECHA>40&&DERECHA<80)
            {
                 PresTecla = true;
                setImage("taz5.png");
                setLocation(this.getX(),this.getY()+4);   
            }
        if(DERECHA>80&&DERECHA<120)
            {
                PresTecla = true;
                setImage("taz6.png");
                setLocation(this.getX(),this.getY()+4);    
            }
        if(DERECHA>120&&DERECHA<160)
            {
                PresTecla = true;
                setImage("taz4.png");
                setLocation(this.getX(),this.getY()+4);   
            }
        }   
      } 
    
     
     /**
     * Función para checar cuando agarra las zanahorias
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
     * Comportamiento de la persoanje
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
    
     public void VerificaMuerte()
    {
        try
      {
          if (((Nivel1)getWorld()).getVidas() == 0)
          {
           PerdioT t1=new PerdioT( );
           Greenfoot.setWorld(t1);
          }
      }
        catch (Exception e) //(((Nivel2)getWorld()).getNivel() == 2)
      {
          try
          {
              if(((Nivel2)getWorld()).getVidas() == 0)
              {
                PerdioT t1=new PerdioT( );
                Greenfoot.setWorld(t1);
              }
          }
          catch (Exception g)
          {
           if(((Nivel3)getWorld()).getVidas() == 0) 
            {
            PerdioT t1=new PerdioT( );
            Greenfoot.setWorld(t1);  
            }
          }
      }
    } 
     
    
    /**
     * Función que checa las vidas que se van quitando, cuando le toca Elmer
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
       GanoT g2=new GanoT();
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
}
