/* 
Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.You may assume that the array is non-empty and the majority element always exist in the array
Ref -
 	https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm
	http://www.geeksforgeeks.org/majority-element/
*/

public class Solution {
    public int majorityElement(int[] nums) {
        int maj_index = 0 , count = 1;
        for( int i = 1;i < nums.length;i++) {
            if(nums[maj_index] == nums[i]) 
                count++;
            else
                count--;
                
            if(count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return nums[maj_index];
    }
}
