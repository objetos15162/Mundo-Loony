/**
 * Write a description of class Timer here.
 * tutoriale wiki
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer  
{
     // variables de instancia - reemplazar el ejemplo a continuación con su propia
     private int time;
     private long lastMark = System.currentTimeMillis();
    
    /** Constructor for objects of class Timer
     * Constructor de la clase Reloj y lo inicializa en 0
     */
    public Timer()
    {
        time=0;
    }
    
    
    /**
     * Marca la hora actual. A continuación, puede en futura convocatoria * MillisElapsed () 
     * para averiguar los milisegundos transcurridos * Desde que se hizo esta marca () llamada. 
     * Una segunda marca () llamada se restablecerá la marca, y millisElapsed () * 
     * Empezará el aumento de cero otra vez.
     */
    public void mark()
    {
        lastMark = System.currentTimeMillis();
    }
    
    /**
     * Devuelve la cantidad de milisegundos que han transcurrido desde la marca () Fue la última 
     * llamada. Este temporizador se ejecuta independientemente de Greenfoot de Acto ciclo (),
     * así que si usted lo llama muchas veces durante el mismo período de Greenfoot,
     * Es posible que también consiga respuestas diferentes.
     */
    public int millisElapsed()
    {
        return (int) (System.currentTimeMillis() - lastMark);
     }
}

