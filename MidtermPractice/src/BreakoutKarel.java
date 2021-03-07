/*This is a Karel program which will create an inside border around the world. Each
location that is part of the border should have one (and only one) beeper on it and the border
should be inset by one square from the outer walls of the world
 */

import stanford.karel.*;

public class BreakoutKarel extends SuperKarel {
	public void run() {
		while (beepersInBag()) {
			if (beepersPresent()) {
				pickBeeper();
				bounce();
			}
			while (frontIsBlocked()) {
				bounce();
			}
			stepDiagonally();
		}
	}
	/*
	 * Causes Karel to perform a ricochet bounce, which requires
	 * no more than turning left.
	 */
	private void bounce() {
		turnLeft();
	}
	/*
	 * Step diagonally. The precondition for this call is that
	 * Karel's front must be clear. The postcondition has Karel
	 * facing in the same direction.
	 */
	private void stepDiagonally() {
		move();
		if (leftIsClear() && noBeepersPresent()) {
			turnLeft();
			move();
			turnRight();
		}
	}
}
