import greenfoot.*;
import java.awt.Color;
//tutoriales youtube
/**
 * Write a description of class Mostrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mostrador extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;
    private String prefix;
    
    /**
     * Constructor del Mostrador 
     */
    public Mostrador()
    {
        this(new String());
    }

    /**
     * (Crea el contenedor y lo inicializa en cero)
     */
    public Mostrador(String prefix)
    {
        background = getImage();  // get image from class
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }
    
    /**
     * (Animar la pantalla para contar hacia arriba (o hacia abajo) al valor objetivo actual)
     */
    public void act() 
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }

    /**
     * (Añadir un nuevo marcador para el valor actual del contador.
     * Esto animará El contador sobre tramas consecutivas hasta que alcanza el nuevo valor.)
     */
    public void add(int score)
    {
        target += score;
    }

    /**
     * Return the current counter value.(Devuelve el valor actual del contador)
     */
    public int getValue()
    {
        return target;
    }

    /**
     *(Establecer un nuevo valor del contador. Esto no va a animar el mostrador.)
     */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
    /**
     *(Establece un prefijo de texto que se debe mostrar antes
      * El valor del contador (por ejemplo, "Score:").)
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    /**
     * (Actualización de la imagen en la pantalla para mostrar el valor actual).
     */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
