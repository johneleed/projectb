
//This program will produce random circles with random radius, colors and location.

package week2;

import acm.program.*;
import acm.util.*;
import acm.graphics.*;

public class RandomCircles extends GraphicsProgram {

	//Number of circles
	private static final int NOC = 10;

	//Minimum radius
	private static final double MIN_RADIUS = 5;

	//Maximum radius
	private static final double MAX_RADIUS = 50;
		
		public void run() {
			for (int i = 0; i < NOC; i++) {
			double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
			double x = rgen.nextDouble(0, getWidth() - 2 * r);
			double y = rgen.nextDouble(0, getHeight() - 2 * r);
			GOval circle = new GOval(x, y, 2 * r, 2 * r);
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
			add(circle);
		}
	}
// Private instance variable
private RandomGenerator rgen = RandomGenerator.getInstance();
}
=======

package week2;

import acm.program.GraphicsProgram;

public class RandomCircles extends GraphicsProgram {

}
=======
//This program will produce random circles with random radius, colors and location.

package week2;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import acm.graphics.GOval;

public class RandomCircles extends GraphicsProgram {

private static final int NOC = 10;
private static final double MIN_RADIUS = 5;
private static final douvle MAX_RADIUS = 50;

	public void run() {
		
		RandomGenerator rgen = new RandomGenerator ();
		for (int i = 0; i < NOC; i++) {
		
			int x = rgen.nextInt(50, 450);
			int y = rgen.nextInt(50, 350);
			int r = rgen.nextInt(5, 50);
			
				GOval circle = new GOval (x, y, r, r);
				add (circle);	
	}
}
