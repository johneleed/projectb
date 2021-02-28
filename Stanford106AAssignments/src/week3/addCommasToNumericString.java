package week3;

import acm.program.ConsoleProgram;

public class addCommasToNumericString extends ConsoleProgram {
	
	public void run() {
		 String digits = readLine("Enter a numeric string: ");
		 while (digits.length() > 0) {
		 println(addCommas(digits));
		 digits = readLine("Enter a numeric string: ");
		 }
	}
	
	private String addCommas(String digits) {
		String results = "";
		int length = digits.length();
		int nDigits = 0;
		for (int i = length -1; i>=0; i--) {
			results = digits.charAt(i) + results;
			nDigits++;
			if (((nDigits % 3) == 0) && (i>0)) {
				results = "," + results;
			}
		}
	return results;
	}	
}
