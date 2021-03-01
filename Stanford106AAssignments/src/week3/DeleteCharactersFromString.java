/*Remove 't' from test, 'e' from Summer is here! and "-" from ---0---
 */

package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram{

	public void run() {

		println(removeAllOccurrences("This is a test", 't') );
		println (removeAllOccurrences("Summer is here!", 'e') );
		println(removeAllOccurrences("---0---", '-') );

	}


	private String removeAllOccurrences (String str1, char ch) {
		while (true) {

			// Find the start of the character to be removed
			int index = str1.indexOf(ch);
			// If there are no more occurrences, you're done
			if (index == -1 ) {
				return str1;

			}
			// If the character is found in the string, remove it
			str1 = str1.substring(0, index) + str1.substring(index + 1);
		}
	}
}