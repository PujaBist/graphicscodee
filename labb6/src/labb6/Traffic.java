package labb6;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;



public class Traffic extends Frame{
	public Traffic() {
		// TODO Auto-generated constructor stub
	setSize(500,500);
	setVisible(true);
	
	
	}
	public void paint(Graphics g)

	{
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(200, 200, 150, 300);
		g.setColor(Color.BLUE);
		g.drawLine(265, 500, 265, 700);
		g.setColor(Color.BLUE);
		g.drawLine(285, 500, 285, 700);
		g.drawLine(265, 700, 285, 700);
		g.setColor(Color.RED);
		g.fillOval(250, 255, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(250, 325, 50, 50);
		g.setColor(Color.YELLOW);
		g.fillOval(250, 395, 50, 50);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Traffic();
		

	}

}

