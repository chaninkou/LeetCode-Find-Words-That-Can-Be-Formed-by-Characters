package findWordsByCharacter;

import java.util.Arrays;

public class FindTotalLengthOfCharactersInWordFunction {
	 public int countCharacters(String[] words, String chars) {
		 // Hold the total length of words appear in chars
		 int totalLength = 0;
		 
		 // Since all letters only contains lowercase
		 int[] haveSeen = new int[26];
		 
		 // Count how many character appears first in chars
		 for(char letter : chars.toCharArray()){
			 // Cool technique to count
			 haveSeen[letter - 'a']++;
		 }
		 
		 // Go through the string of array now, check each element and count them
		 for(String word : words){
			 int[] tempSeen = Arrays.copyOf(haveSeen, haveSeen.length);
			 
			 int eachElementCount = 0;
			 
			 for(char c : word.toCharArray()){
				 // If the count is not negative
				 if(tempSeen[c - 'a'] > 0){
					 // Decrease the count
					 tempSeen[c - 'a']--;
					 
					 // Increase the count
					 eachElementCount++;
				 } else { // Since its negative, break right away to get better time
					 break;
				 }
			 }
			 
			 // Only add the temp count to total length when letters count are exact of the current word
			 if(eachElementCount == word.length()){
				 totalLength += eachElementCount;
			 }
			 
		 }

		 return totalLength;
	 }
}
