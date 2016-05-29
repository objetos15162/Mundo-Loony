import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letrero extends Actor
{
  /**
  * Método para elaborar el letrero
  */
   private static final Color transparent = new Color(0,0,0,0);
   public Letrero(String cadena)
   {
      GreenfootImage letrero;
      letrero= new GreenfootImage(cadena,100, java.awt.Color.WHITE, transparent);
      setImage(letrero);
    } 
}
