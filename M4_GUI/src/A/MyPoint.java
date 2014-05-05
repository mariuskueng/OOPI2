package A;

import java.awt.Point;

public class MyPoint{
	private Point p;
	private int type;
	public MyPoint(Point p, int t){
		this.p=p;
		type=t;
	}
	public int getType(){return type;}
	public Point getPoint(){return p;}
}