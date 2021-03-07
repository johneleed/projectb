/* This program that asks the user for a list of names (one per line) 
 * until the user enters a blank line. 
 * At that point the program should print out how many times 
 * each name in the list was entered. 
 */

package week4;

import acm.program.ConsoleProgram;
import java.util.*;

public class NameCounts extends ConsoleProgram {
	
	public void run() {
		HashMap<String,Integer> nameMap = new HashMap<String,Integer>();
		 
		readNames(nameMap);
		 printMap(nameMap);
		}
	
	/* Reads a list of names from the user, storing names
	 *  and how many times each appeared in the map that is passed in as a parameter.
	 */
	
	private void readNames(Map<String,Integer> map) {
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			
			// See if that name previously appeared in the map. Update
			// count if it did, or create a new count if it didn't.
			Integer count = map.get(name);
			if (count == null) {
				count = new Integer(1);
			} else {
				count = new Integer(count + 1);
			}
			
			//add name and count
			map.put(name, count);
		}
	}
	
	/*  Prints out list of entries (and associated counts) from the map
	 *  that is passed in as a parameter.
	 */
	
	private void printMap(Map<String,Integer> map) {
		
		//List through a set of values
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int count = map.get(key);
			println("Entry [" + key + "] has count " + count);
		}
	}
}