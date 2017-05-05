package gfx;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Text {
	public static void drawString(Graphics g, String text, int posX, int posY, boolean center, Color c)
	{
		g.setColor(c);
		int x = posX;
		int y = posY;
		FontMetrics fm = g.getFontMetrics();
		if(center)
		{
			
			x = x - fm.stringWidth(text)/2;
			y = (y - fm.getHeight()/2) + fm.getAscent();
		}
		
		g.drawString(text, x, y);
	}
}