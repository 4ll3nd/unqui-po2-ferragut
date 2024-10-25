package ar.edu.unq.po2.tp3;
import ar.edu.unq.po2.tp3.Point;
public class Rectangulo {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	
	/**
	 * To made a correct Rectangle the coordenate x from the point p1 and p2
	 * has to be equals, the coordenate x from the point p3 and p4 has to be 
	 * equals.
	 * 
	 * the coordenate y from p2 and p3 has to be equals, the coordenate 
	 * y from p1 and p4 has to be equals too.
	 * 
	 * p2|-----|p3
	 *   |     |
	 *   |     |
	 *   |     |
	 * p1|-----|p4
	 * */
	public Rectangulo(Point p1, Point p2, Point p3, Point p4) {
		if (isConsitent(p1, p2, p3, p4)) {
			this.p1 = p1;
			this.p2 = p2;
			this.p3 = p3;
			this.p4 = p4;
		}
		else {
			throw new IllegalArgumentException("the coordinate x from both point have to be equals");
		}
	}

	private boolean isConsitent(Point p1, Point p2, Point p3, Point p4) {
		return p1.getX() == p2.getX() && p3.getX() == p4.getX() && p2.getY() == p3.getY() && p1.getY() == p4.getY();
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public Point getP3() {
		return p3;
	}

	public Point getP4() {
		return p4;
	}
	
	public int getArea() {
		return (this.getSide() * this.getSide());
	}
	/**
	 * OBSERVATION:
	 * to get the side from rectangule sum the p1 with p2 and get the 
	 * y coordenate from the new point. 
	 * */
	public int getSide() {
		return (this.getP1().sumPointToActualPoint (this.getP2()).getY());
	}
	/**
	 * OBSERVATION:
	 * to get the width from a rectangule sum the p1 and p3 and get the x
	 * coordenate from the new point.
	 * */
	
	public int getPerimeter() {
		return(2 * (this.getSide() + this.getWidth()));
	}
	
	public int getWidth() {
		return (this.getP1().sumPointToActualPoint(this.getP3()).getX());
	}
	/**
	 * OBSERVATION:
	 * to now if a rectangule is horizontal the X from the point p4 has
	 * to be bigger than p3 Y coordenate   
	 * */
	public Boolean isHorizontal() {
		return(this.getP4().getX() > this.getP3().getY());
	} 
	/**
	 * OBSERVATION:
	 * to now if a rectangule is vertical the Y from the point p3 has
	 * to be bigger than p4 X coordenate.   
	 * */
	public Boolean isVertical() {
		return(this.getP3().getY() > this.getP4().getX());
	}
	
}
