/*
* This program doesn't do anything useful and exists only to test
* your understanding of method calls and parameter passing.
*/

package week3;

import acm.program.*;

public class Mystery extends ConsoleProgram {

	public void run() {
		ghost(13);
	}

	private void ghost(int x) {
		int y = 0;
		for (int i = 1; i < x; i *= 2) {
			y = witch(y, skeleton(x, i));
		}
		//(println 5) ghost: x = 13, y = 1011
		println("ghost: x = " + x + ", y = " + y); 
	}

	private int witch(int x, int y) {
		x = 10 * x + y;
		
		//println 1) witch: x = 1, y = 1
		//println 2) witch: x = 10, y = 0
		//println 3) witch: x = 101, y = 1
		//println 4) witch: x = 1011, y = 1
		println("witch: x = " + x + ", y = " + y);
		return x;
	}
	
	private int skeleton(int x, int y) {
		return x / y % 2;
	}
}