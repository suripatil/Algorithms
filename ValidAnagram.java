/* given two strings s and t, write a function to determine if t is an anagram of s.
For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.
Note: You may assume the string contains only lowercase alphabets. 
Ans - 
Brute Force - 
Take Char array of 256 , with ASCII Value Traverse the source string  increment the count for occurring char.
Traverse destination string and decrement the ASCII count which was incremented.
Lastly traverse the source string and check the count if not 0 then return false else True.
Takes 0(n3). */

//Optimal with Sorting - 
public class Solution {
public boolean isAnagram(String s, String t) {
    
        if(s==null || t==null || s.length()!=t.length())
            return false;
        
        char[] src = s.toCharArray();
        char[] dst = t.toCharArray();
        
        Arrays.sort(src);
        Arrays.sort(dst);
        
        if(new String(src).equals(new String(dst))) /* String comparing is faster than Array */
            return true;
        return false;
    }
}

