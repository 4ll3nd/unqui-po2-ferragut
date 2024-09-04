package ar.edu.unq.po2.tp3;

public class Point {
	private int x = 0;
	private int y = 0;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	/**
	 * movePointTo modified the coordenate of the current point to *X* and *Y*
	 * */
	public void movePointTo (int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Point sumPointToActualPoint(Point p) {
		Point point = new Point((this.getX() + p.getX()), (this.getY() + p.getY()));
		return point;
	}
	
	private void setX(int x) {
		this.x = x;
	}
	
	private void setY(int y) {
		this.y = y;
	}
	
}
