/*Q18 - Word Pattern

Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.

Put method returns the previous value for the key if exists , based on indexes of pattern and words check equality if not return false.
Objects.equals(a,b) -> Handles null and autoboxing well.
Ans -
*/

public class Solution {
	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if (words.length != pattern.length())
			return false;
		Map index  = new HashMap();
		for(int i =0; i < words.length; i++) {
			if(!Objects.equals(index.put(pattern.charAt(i),i),index.put(words[i],i)))
				return false;
		}
		return true;
	}
}

