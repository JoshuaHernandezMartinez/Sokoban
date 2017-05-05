package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;

import gfx.Text;
import input.MouseManager;

public class Button{
	
	private String text;
	private int x, y;
	private FontMetrics fm;
	private Rectangle bounds;
	private boolean hovering;
	private Click click;
	private Font font;
	
	public Button(String text, int x, int y, Click click, Font font){
		this.text = text;
		this.x = x;
		this.y = y;
		this.click = click;
		hovering = false;
		this.font = font;
	}
	
	public void update(){		
		if(bounds != null && bounds.contains(MouseManager.x, MouseManager.y)){
			hovering = true;
			if(MouseManager.left)
				click.onClick();
		}else
			hovering = false;
	}
	
	public void render(Graphics g){
		g.setFont(font);
		fm = g.getFontMetrics();
		if(hovering)
			Text.drawString(g, text, x, y, true, Color.RED);
		else
			Text.drawString(g, text, x, y, true, Color.BLUE);
		bounds = new Rectangle(x - fm.stringWidth(text)/2, y - fm.getHeight()/2, fm.stringWidth(text), fm.getHeight());
	}
	
}
