
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

