/*Q20 - Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
For example,
Given "egg", "add", return true.
Given "foo", "bar", return false.
Given "paper", "title", return true.

Ans - */

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] count = new int[512];
        for(int i=0; i < s.length();i++) {
            if(count[s.charAt(i)] != count[t.charAt(i)+256]) return false;
            count[s.charAt(i)] = count[t.charAt(i)+256] = i+1;
        }
        return true;
    }
}


