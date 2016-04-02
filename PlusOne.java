/*Given a non-negative number represented as an array of digits, plus one to the number.
The digits are stored such that the most significant digit is at the head of the list.

Ans - */ 
public class Solution {
	public int[] plusOne(int[] digits) {
		for(int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i]++;
				return digits;
			}
		}
		int[] new_digits = new int[digits.length+1];
		new_digits[0] = 1;
		return new_digits;
	}
}
/*
For the digits equal 9 keep adding 0 if not plus one and return. Special case when input is [99] result will be [100] so create new array with length+1 and assign first element to 1 so it will return [100].
*/

