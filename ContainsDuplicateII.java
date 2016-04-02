/* Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and jis at most k.
http://blog.welkinlan.com/2015/09/11/contains-duplicate-i-ii-iii-leetcode-java/
Ans - */

public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i = 0; i < nums.length;i++) {
			if(map.containsKey(nums[i])) {
				if(Math.abs(map.get(nums[i])-i) <= k) {
					return true;
				} else {
					map.put(nums[i],i);
				}

			} else {
				map.put(nums[i],i);
			}
		}
		return false;
	}
}
/*
Map the array value and indexes to Hasmap - Key becomes array element and value becomes index of the array. If the value already present get the index and substract with i ( i - j) if the result is <= k then return true. At most means nearby difference to k. */

//Using set and Sliding window

public boolean containsNearbyDuplicate(int[] nums, int k) {
	Set<Integer> set = new HashSet<Integer>();
	for(int i = 0; i < nums.length; i++){
		if(i > k) set.remove(nums[i-k-1]);
		if(!set.add(nums[i])) return true;
	}
	return false;
}

