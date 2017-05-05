package input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseManager extends MouseAdapter{
	
	public static int x, y;
	public static boolean left;
	
	public MouseManager(){
		x = 0;
		y = 0;
	}
	
	@Override
	public void mousePressed(MouseEvent e){
		if(e.getButton() == MouseEvent.BUTTON1)
			left = true;
	}
	
	@Override
	public void mouseReleased(MouseEvent e){
		if(e.getButton() == MouseEvent.BUTTON1)
			left = false;
	}
	@Override
	public void mouseDragged(MouseEvent e){
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseMoved(MouseEvent e){
		x = e.getX();
		y = e.getY();
	}
	
}
