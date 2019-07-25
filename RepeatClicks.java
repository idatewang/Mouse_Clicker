import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;

public class RepeatClicks
{
    private static Robot robot = null;    
    public static void main(String[] args) 
    {
    	for (int i = 0; i <5; i = i+1) //Change 5 to how many time you want to click.
    	{
    	try {
    		robot = new Robot ();
    	} catch (AWTException e){
    		e.printStackTrace();
    	}    
    	klick (1570 , 580); //Set x, y coodinates in the parenthesis, unit is pixel.
    }
    }
	public static void klick (int x , int y)
	{
		robot.mouseMove(x, y);
		robot.delay(100); //100 is the delay time, unknown unit.
		robot.mousePress(MouseEvent.BUTTON1_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_MASK);
	}
}