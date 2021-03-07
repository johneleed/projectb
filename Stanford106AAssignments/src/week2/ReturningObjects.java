package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class ReturningObjects extends GraphicsProgram{
	
	private GOval filledCircle (double x, double y, double r) {
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		return circle;
	}

}
