package A;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyPanelA extends JPanel implements MouseListener{
	private ArrayList<MyPoint> al= new ArrayList<MyPoint>();
	private int anchor;
	
	public MyPanelA(){  
		Canvas c = new Canvas();
		this.setSize(new Dimension(400, 300));
		this.setBackground(Color.white);
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g){  
		super.paint(g);
		for (MyPoint p:al){
			int h=getHeight();
			int w=getWidth();
			g.setColor(Color.BLACK);
			g.drawLine(0, 0, h, w);
		}
	}
	
	public void setAnchor(int a){
		anchor=a;
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		al.add(new MyPoint(arg0.getPoint(), anchor));
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}


}
