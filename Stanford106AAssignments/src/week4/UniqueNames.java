/*This program that asks the user for a list of names (one per line) until the user enters a
* blank line (i.e., just hits return when asked for a name). At that point the program should
* print out the list of names entered, where each name is listed only once (i.e., uniquely) no
* matter how many times the user entered the name in the program. 
*/

package week4;

import acm.program.ConsoleProgram;
import java.util.*; 

public class UniqueNames extends ConsoleProgram {
	
	public void run() {
		 ArrayList<String> list = new ArrayList<String>();
		 while (true) {
			 String name = readLine("Enter name: "); 
			 if (name.equals("")) break;
			 if (!list.contains(name)) {
				 list.add(name);
			 }
		 }
		
		 println("Unique name list contains:");
		 printList(list); 
	}
	 /* Prints out contents of ArrayList, one element per line */
	private void printList(ArrayList list) {
		for(int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}
}