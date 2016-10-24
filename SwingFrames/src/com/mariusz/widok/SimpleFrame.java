package com.mariusz.widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class SimpleFrame extends JFrame
{
	public SimpleFrame()
	{
		add(new DrawComponent());
		pack();
	}
}


class DrawComponent extends JComponent
{
	private static final int width = 300;
	private static final int height = 200;
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rect = new Rectangle2D.Double(100,100,200,150);
		g2.draw(rect);
	}
}