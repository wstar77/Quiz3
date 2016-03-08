package base;

public class Triangle {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	
	public Triangle () {}
	
	public Triangle (double s1, double s2, double s3) {
		
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public static double sqrt(double d) {
		double t;
	 
		double squareRoot = d / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (d / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	public static double getArea (double s1, double s2, double s3) {
		double sp = ((s1 + s2 + s3) / 2);
		double ar = (sqrt(sp * (sp - s1) * (sp - s2) * (sp - s3)));
		return ar;
	}
	
	public static double getPerimeter (double s1, double s2, double s3) {
		double per = (s1 + s2 + s3);
		return per;
	
}}
