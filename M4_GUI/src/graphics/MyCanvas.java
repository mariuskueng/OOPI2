package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

public class MyCanvas extends Canvas implements MouseListener{
	
	private int oldX;
	private int oldY;
	private int enterX;
	private int enterY;
	private Color myColor;
	private ArrayList<Line> linien;
	
	public MyCanvas() {
		this.setSize(400, 300);
		this.setBackground(Color.white);
		this.addMouseListener(this);
		linien = new ArrayList<MyCanvas.Line>();
	}

	@Override
	public void paint(Graphics g) {
		for (Line l: linien) {
			g.setColor(myColor);
			g.drawLine(l.x1, l.y1, l.x2, l.y2);
			this.repaint();
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		myColor = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		this.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		enterX = e.getX();
		enterY = e.getY();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		linien.add(new Line(enterX, enterY, e.getX(), e.getY()));
		this.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		oldX = e.getX();
		oldY = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		linien.add(new Line(enterX, enterY, e.getX(), e.getY()));
		
	}
	
	public class Line {
		public int x1;
		public int y1;
		public int x2;
		public int y2;
		
		public Line(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

}
