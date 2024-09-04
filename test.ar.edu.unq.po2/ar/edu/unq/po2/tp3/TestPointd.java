package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestPointd {
	private Point point    = new Point(1,1);
	private Point pointTwo = new Point(3,3);
	
	@Test
	public void testXAndYOfPoint() {
		assertEquals(point.getX(), 1);
		assertEquals(point.getY(), 1);
	}
	@Test
	public void testMovePointTo() {
		point.movePointTo(3, 3);
		assertEquals(point.getX(), 3);
		assertEquals(point.getY(), 3);
	}
	@Test
	public void testSumPointToPoint() {
		Point sumPoint = point.sumPointToActualPoint(pointTwo);
		assertEquals(sumPoint.getX(), 4);
		assertEquals(sumPoint.getY(), 4);
	}
}
