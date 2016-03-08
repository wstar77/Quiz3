package base;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class TriangleTest {

	@Test
	public void testgetArea() {
		
		double s1 = 1.0;
		double s2 = 2.0;
		double s3 = 5.0;
		
		double expected = 4.9;
		double result = TriangleTest.getArea(s1, s2, s3);
		
		assertEquals(expected, result, .0001);
	}

	@Test
	public void testgetPerimeter() {
		
		double s1 = 1.0;
		double s2 = 2.0;
		double s3 = 5.0;
		
		double expected = 8.0;
		double result = TriangleTest.getPerimeter(s1, s2, s3);
		
		assertEquals(expected, result, .0001);
	}

	
	public static double sqrt(double d) {
		double t;
	 
		double squareRoot = d / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (d / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot; }
		
	public static double getArea (double s1, double s2, double s3) {
		double sp = ((s1 + s2 + s3) / 2);
		double ar = (sqrt(sp * (sp - s1) * (sp - s2) * (sp - s3)));
		return ar;
	}
	
	public static double getPerimeter (double s1, double s2, double s3) {
		double per = (s1 + s2 + s3);
		return per;
	
}
	}


