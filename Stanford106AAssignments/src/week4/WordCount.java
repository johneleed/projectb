/*This program reads a file and reports how  
 * many lines, words, and characters appear in it. 
 */

package week4;

import acm.program.ConsoleProgram;
import java.io.*;

public class WordCount extends ConsoleProgram {

	//keep track of lines, words and characters
	public void run() {
		int lines = 0;
		int words = 0;
		int chars = 0;
		
		//Instantiate Buffered Reader in the try catch.
		//Open a file on disk
		BufferedReader rd = openFileReader("File: ");
		
		//throw an exception and try to catch exception
		try {
			while (true) {
				
				//Get me a line from the file, it keeps track where it is
				String line = rd.readLine();
				
				//If you reach the end of the file, break
				if (line == null) break;
				lines++;
				words += countWords(line);
				chars += line.length();
			}
			//Object 'rd' close 
			rd.close();
		
		//catch input/output exception
		} catch (IOException ex) {
			println("An I/O exception has occurred");
		}
		println("Lines = " + lines);
		println("Words = " + words);
		println("Chars = " + chars);
	}

	//Asks the user for the name of the text file
	private BufferedReader openFileReader(String prompt) {
		
		//local variable point to an object and set it to be null
		BufferedReader rd = null;
		
		//while it remains null
		while (rd == null) {
			
			//ask for a user a line
			String name = readLine(prompt);
			
			//try to open up a BufferReader to that file
			try {
				
				//method and parameter that passes the name of the file
				rd = new BufferedReader(new FileReader(name));
				
			//execute catch if file can't be opened 
			//returns to while loop until it gets a valid object which is file	
			} catch (IOException ex) {
				println("Can't open that file.");
			}
		}
		
		//return the object to rd
		return rd;
	}

	/*
	 * Counts the words (consecutive strings of letters and/or digits)
	 * in the input line.
	 */

	//Call countWords method that passes a string line parameter
	private int countWords(String line) {
		
		//condition inWord if false 
		boolean inWord = false;
		int words = 0;
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				inWord = true;
			} else {
				if (inWord) words++;
				inWord = false;
			}
		}
		if (inWord) words++;
		return words;
	}
}