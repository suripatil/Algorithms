/* Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
*/

//Brute Force - But O(k*n) not good solution

public class Solution {
	public void rotate(int[] nums, int k) {
		int temp,j;
		if(nums.length > 0 && k > 0) {
			for(int i = 0; i < k; i++) {
				temp = nums[nums.length-1];

				for(j = nums.length -1;j > 0; j--) 
					nums[j] = nums[j-1];

				nums[j] = temp;
			}
		}
	}
}

//Best Solution - O(n) with slicing and reversing whole array

public class Solution {
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		rotate_func(nums,0,nums.length-1);//Reverse Full Array
		rotate_func(nums,0,k-1); //Reverse First half till k
		rotate_func(nums,k,nums.length-1); //Reverse second half from k
	}
	public void rotate_func(int[] nums,int st,int ed) {
		int temp;
		while (st < ed) {
			temp = nums[st];
			nums[st] = nums[ed];
			nums[ed] = temp;
			st++;
			ed--;
		}   
	}
}


