package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	//Max term value must not exceed 10,000.
	private static final int MAX_TERM_VALUE = 10000;
	
	public void run() {
	println("This program lists the Fibonacci Sequence:");
	
		int term = 0;
		int term1 = 1;
		while (term <= MAX_TERM_VALUE) {	
			println(term);					
			int term2 = term + term1;			
			term  = term1;					
			term1 = term2;					
			}
	}
}
