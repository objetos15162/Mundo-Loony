import greenfoot.*;

/**
 * Write a description of class Record here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Record extends World
{
     /**
     * Constructor for objects of class Record.(Constructor del Record)
     */
    public Record()
    {    
        super(600, 400, 1);
        ScoreBoard bp=new ScoreBoard(600,350);
        addObject(bp,600,300);
    }
    
}
