/*Write a method removeDoubledLetters that takes a string as its argument and returns a new
string with all doubled letters in the string replaced by a single letter. 
 */
public class StringsAndCharacters {

	private String removeDoubledLetters(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0 || ch != str.charAt(i - 1)) {
				result += ch;
			}
		}
		return result;
	}
}
