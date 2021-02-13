/* Karel's job is to check enclosed rectangles.
 * If there's a beeper in the enclosed rectangle, Karel moves to the next space.
 * If there's no beeper in the center square, Karel must check the other two squares
 * and pickup any beepers.
 */
package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	public void run() {
		
/* If the front is clear move. 
 * Check if there are any beepers. 
 * If there are beepers pick them up and move.
 */		
	while (frontIsClear()) {
		move();
		checkForBeepers();
		pickupExtraBeepers();
		move();
		}				
	}
/* If there are beepers present, move. 
 * If there are no beepers present clean any Beepers on the Left or Right space
 */
	private void checkForBeepers() {
		if (beepersPresent()) {
			move ();
			move ();
		}
	}	
	private void pickupExtraBeepers() {
		if (noBeepersPresent()) {
			cleanBeepersRight();
			cleanBeepersLeft();
		}		
	}
/* Karel moves Right, checks for beepers, and picks them up
 * if there are any there.
 * To do this, Karel turns Right and moves.
 * If beepers are present, Karel picks up beepers.
 * To go back to the middle, Karel turns around and moves.
 */
	private void cleanBeepersRight() {
		turnRight();
		move();
			while (beepersPresent()) {
			pickBeeper();
			}
		turnAround();
		move();
	}
/* Karel moves Left, checks for beepers, and picks them up
 * if there are any there.
 * To do this, Karel turns Left and moves.
 * If beepers are present, Karel picks up beepers.
 * To go back to the middle, Karel turns around and moves.
 * Karel turns left so he is facing east to continue.
 */
	private void cleanBeepersLeft() {
		move();
			while (beepersPresent()) {
			pickBeeper();
			}
		turnAround();
		move();
		turnLeft();
	}
}