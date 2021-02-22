package week2;

/*
 * File: Hogwarts.java
 * -------------------
 * This program is just testing your understanding of parameter passing. 
 * Comments are to illustrate tracing method execution. 
 */

import acm.program.*;

public class Hogwarts extends ConsoleProgram {
	public void run() {
		bludger(2001);								//method buldger with parameter value 2001
	}
	
	private void bludger(int y) { 					//int y = 2001
		  
		int x = y / 1000;							//2 = 2001/1000
		int z = (x + y);							//2003 = (2+2001)
		x = quaffle(z, y);							//1001 = quaffle(1001, 2001) 
		
		println("bludger: x = " + x + ", y = " + y + ", z = " + z); 
		//Output3 is bludger x = 1001, y = 2001, z = 2003
	}
	
	private int quaffle(int x, int y) {				//quaffle(2003, 2001)
		int z = snitch(x + y, y);					//1001 = snitch(2003+2001, 2001)
		y /= z;										//1001 /= 1001 this reassigns y to 1
		
		println("quaffle: x = " + x + ", y = " + y + ", z = " + z);
		//Output2 is quaffle: x = 2003, y = 1, z = 1001
		return z;									//return z value to the original method call, x 
	}

	private int snitch(int x, int y) {				//snitch(4004, 2001)
		y = x / (x % 10);							//1001 = 4004 / (4004 % 10)
		
		println("snitch: x = " + x + ", y = " + y);	
		//Output1 is snitch: x = 4004, y = 1001
		return y;									//return y value to the original method call, z 
	}
}