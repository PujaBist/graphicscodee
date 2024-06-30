package labb6;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import lab6.Pacman;

public class Pacman extends Frame {
	public Pacman () {
		// TODO Auto-generated constructor stub
		setSize(500,500);
		setVisible(true);
		
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
	g.fillArc(100, 150, 150, 150, 30, 300);
	g.setColor(Color.green);
		g.fillOval(200, 220, 10, 10);
		g.fillOval(220, 220, 10, 10);
		g.fillOval(240, 220, 10, 10);
		g.fillOval(260, 220, 10, 10);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Pacman();

	}

}