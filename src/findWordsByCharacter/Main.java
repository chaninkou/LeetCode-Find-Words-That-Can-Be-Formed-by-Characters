package findWordsByCharacter;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] words = {"cat","bt","hat","tree"};
		
		String chars = "atach";
		
		System.out.println("Input words: " + Arrays.toString(words));
		
		System.out.println("Word to find: " + chars);
		
		FindTotalLengthOfCharactersInWordFunction solution = new FindTotalLengthOfCharactersInWordFunction();
		
		System.out.println("Total lengths: " + solution.countCharacters(words, chars));
	}
}
