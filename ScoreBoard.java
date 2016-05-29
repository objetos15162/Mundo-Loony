import greenfoot.*; 
import java.awt.Color;
import java.util.List;
//tutoriales de youtube
/**
 * An actor class that can display a scoreboard, using Greenfoot's
 * UserInfo class.  
 * You typically use this by including some code into the world for when your game ends:
 * <pre>
 *   addObject(new ScoreBoard(800, 600), getWidth() / 2, getHeight() / 2); 
 * </pre>
 * Where 800 by 600 should be replaced by the desired size of the score board. 
 * @author Neil Brown 
 * @version 1.0
 */
public class ScoreBoard extends Actor
{
    //(El espacio vertical entre las imágenes de los usuarios en el marcador)
    private static final int GAP = 10;
    // ( La altura de las "Todos los jugadores" / "Near Me" de texto en la parte superior)
    private static final int HEADER_TEXT_HEIGHT = 25;
    // (La principal Color del texto)
    private static final Color MAIN_COLOR = new Color(0x60, 0x60, 0x60); // dark grey
    // ( El color puntuación)
    private static final Color SCORE_COLOR = new Color(0xB0, 0x40, 0x40); // orange-y
    //( El color de fondo)
    private static final Color BACKGROUND_COLOR = new Color(0xFF, 0xFF, 0xFF, 0xB0);
    private static final Color BACKGROUND_HIGHLIGHT_COLOR = new Color(180, 230, 255, 0xB0);

    /**
     * (Constructor para objetos de la clase MARCADOR)
     * (Puede especificar el ancho y alto que el marcador debe ser, pero
     * Una anchura mínima de 600 se hará cumplir.)
     */
    public ScoreBoard(int width, int height)
    {    
        setImage(new GreenfootImage(Math.max(600, width), height));
        drawScores();
    }
    
    private void drawString(String text, int x, int y, Color color, int height)
    {
        getImage().drawImage(new GreenfootImage(text, height, color, new Color (0, true)), x, y);
    }
    
    private void drawScores()
    {
        //( 50 píxeles es la altura máxima de la imagen de usuario)
        final int pixelsPerUser = 50 + 2*GAP;
        //(Calcular la cantidad de usuarios que tenemos espacio para:)
        final int numUsers = ((getImage().getHeight() - (HEADER_TEXT_HEIGHT + 10)) / pixelsPerUser);
        final int topSpace = getImage().getHeight() - (numUsers * pixelsPerUser) - GAP;
        
        getImage().setColor(BACKGROUND_COLOR);
        getImage().fill();
        drawString("All Players", 100, topSpace - HEADER_TEXT_HEIGHT - 5, MAIN_COLOR, HEADER_TEXT_HEIGHT);
        drawString("Near You", 100 + getImage().getWidth() / 2, topSpace - HEADER_TEXT_HEIGHT - 5, MAIN_COLOR, HEADER_TEXT_HEIGHT);
        drawUserPanel(GAP, topSpace, (getImage().getWidth() / 2) - GAP, topSpace + numUsers * pixelsPerUser, UserInfo.getTop(numUsers));
        drawUserPanel(GAP + getImage().getWidth() / 2, topSpace, getImage().getWidth() - GAP, topSpace + numUsers * pixelsPerUser, UserInfo.getNearby(numUsers));
    }
    
    private void drawUserPanel(int left, int top, int right, int bottom, List users)
    {
        getImage().setColor(MAIN_COLOR);
        getImage().drawRect(left, top, right - left, bottom - top);
        
        if (users == null)
        return;
        
        UserInfo me = UserInfo.getMyInfo();
        int y = top + GAP;
        for (Object obj : users)
        {
            UserInfo playerData = (UserInfo)obj;            
            Color c;
            
            if (me != null && playerData.getUserName().equals(me.getUserName()))
            {
              // Highlight our row in a sky blue colour:
              c = BACKGROUND_HIGHLIGHT_COLOR;
            }
            else
            {
              c = BACKGROUND_COLOR;
            }
            getImage().setColor(c);
            getImage().fillRect(left + 5, y - GAP + 1, right - left - 10, 50 + 2*GAP - 1);

            int x = left + 10;
            drawString("#" + Integer.toString(playerData.getRank()), x, y+18, MAIN_COLOR, 14);
            x += 50;
            drawString(Integer.toString(playerData.getScore()), x, y+18, SCORE_COLOR, 14);
            x += 80;
            getImage().drawImage(playerData.getUserImage(), x, y);
            x += 55;
            drawString(playerData.getUserName(), x, y + 18, MAIN_COLOR, 14);
            y += 50 + 2*GAP;
        }
    }
}