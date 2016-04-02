/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution.
Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class Solution {
	public int[] twoSum(int[] nums, int target) {

		int[] twoSum = new int[2];
		HashMap<Integer,Integer> mp = new HashMap();

		for (int i =0; i < nums.length; i++) {
			if(mp.containsKey(target - nums[i])) { // Map Contains value with addition of that value we num1 + num2 == traget
				twoSum[1] = i;
				twoSum[0] = mp.get(target - nums[i]);
				break;
			}
			//Insert Value and index
			mp.put(nums[i],i);
		}
		return twoSum;
	}
}

