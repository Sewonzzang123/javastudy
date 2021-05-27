package calculator;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("computer-areaCircle");
		return Math.PI*r*r;
	}
}
