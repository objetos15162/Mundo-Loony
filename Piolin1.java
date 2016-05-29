import greenfoot.*;  

/**
 * Write a description of class Piolin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piolin1 extends Personajes1
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
    //private final GreenfootImage imagenPrin = new GreenfootImage("piolin1.png");
    private int x;
    private int y;
    private int p4;//Bandera de perdio
    
    /**
     * Constructor de piolin
     */
     public Piolin1()
    {
        score=0;
        speed = 4;
        PresTecla = false;
        nivel = false;
        nivel2=false;   
    }
    
    /**
     * Función para mover a piolin
     */
    public void Mover()
    {
       PresTecla = false;
       if(Greenfoot.isKeyDown("left"))
        {                           
        if(IZQUIERDA<40)
            {
                 PresTecla = true;
                setImage("piolin5.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>41&&IZQUIERDA<80)
            {
                 PresTecla = true;
                setImage("piolin6.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>81&&IZQUIERDA<120)
            {
                 PresTecla = true;  
                setImage("piolin7.png");
                setLocation(this.getX()-2,this.getY());
           }
        if(IZQUIERDA>121&&IZQUIERDA<160)
            {
                 PresTecla = true;
                setImage("piolin8.png");
                setLocation(this.getX()-2,this.getY());
            
            }
        }
       if(Greenfoot.isKeyDown("right"))
        {
        if(DERECHA<40)
            {
                PresTecla = true;
                setImage("piolin1.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>41&&DERECHA<80)
            {
                 PresTecla = true;
                setImage("piolin2.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>81&&DERECHA<120)
            {
                PresTecla = true;
                setImage("piolin3.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>121&&DERECHA<160)
            {
                PresTecla = true;
                setImage("piolin4.png");
                setLocation(this.getX()+2,this.getY());   
            }
        }   
    }
    
    /**
     * Función para mover a piolin
     */
    public void Mover2()
    {
       PresTecla = false;
       if(Greenfoot.isKeyDown("left"))
        {                           
        if(IZQUIERDA<40)
            {
                 PresTecla = true;
                setImage("piolin5.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>41&&IZQUIERDA<80)
            {
                 PresTecla = true;
                setImage("piolin6.png");
                setLocation(this.getX()-2,this.getY());
            }
        if(IZQUIERDA>81&&IZQUIERDA<120)
            {
                 PresTecla = true;  
                setImage("piolin7.png");
                setLocation(this.getX()-2,this.getY());
           }
        if(IZQUIERDA>121&&IZQUIERDA<160)
            {
                 PresTecla = true;
                setImage("piolin8.png");
                setLocation(this.getX()-2,this.getY());
            
            }
        }
       if(Greenfoot.isKeyDown("right"))
        {
        if(DERECHA<40)
            {
                PresTecla = true;
                setImage("piolin1.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>41&&DERECHA<80)
            {
                 PresTecla = true;
                setImage("piolin2.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>81&&DERECHA<120)
            {
                PresTecla = true;
                setImage("piolin3.png");
                setLocation(this.getX()+2,this.getY());   
            }
        if(DERECHA>121&&DERECHA<160)
            {
                PresTecla = true;
                setImage("piolin4.png");
                setLocation(this.getX()+2,this.getY());   
            }
        }
       if(Greenfoot.isKeyDown("up"))
        {                           
        if(IZQUIERDA<40)
            {
                 PresTecla = true;
                setImage("piolin5.png");
                setLocation(this.getX(),this.getY()-4);
            }
        if(IZQUIERDA>41&&IZQUIERDA<80)
            {
                 PresTecla = true;
                setImage("piolin6.png");
                setLocation(this.getX(),this.getY()-4);
            }
        if(IZQUIERDA>81&&IZQUIERDA<120)
            {
                 PresTecla = true;  
                setImage("piolin7.png");
                setLocation(this.getX(),this.getY()-4);
           }
        if(IZQUIERDA>121&&IZQUIERDA<160)
            {
                 PresTecla = true;
                setImage("piolin8.png");
                setLocation(this.getX(),this.getY()-4);
            }
        }
       if(Greenfoot.isKeyDown("down"))
        {
        if(DERECHA<40)
            {
                PresTecla = true;
                setImage("piolin1.png");
                 setLocation(this.getX(),this.getY()+4);   
            }
        if(DERECHA>41&&DERECHA<80)
            {
                 PresTecla = true;
                setImage("piolin2.png");
                setLocation(this.getX(),this.getY()+4);   
            }
        if(DERECHA>81&&DERECHA<120)
            {
                PresTecla = true;
                setImage("piolin3.png");
                 setLocation(this.getX(),this.getY()+4);     
            }
        if(DERECHA>121&&DERECHA<160)
            {
                PresTecla = true;
                setImage("piolin4.png");
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
     * Comportamiento de Piolind
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
       GanoPi g2=new GanoPi();
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
          PerdioPi pi2=new PerdioPi();
          Greenfoot.setWorld(pi2);   
          }
      }
        catch (Exception e) //(((Nivel2)getWorld()).getNivel() == 2)
      {
          try
          {
              if(((Nivel2)getWorld()).getVidas() == 0)
              {
                PerdioPi pi2=new PerdioPi();
                Greenfoot.setWorld(pi2);    
              }
          }
          catch (Exception g)
          {
           if(((Nivel3)getWorld()).getVidas() == 0) 
            {
            PerdioPi pi2=new PerdioPi();
            Greenfoot.setWorld(pi2);     
            }
          }
      }
    } 
}
