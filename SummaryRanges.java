/* Given a sorted integer array without duplicates, return the summary of its ranges.
For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
Ans - */

public class Solution {
	public List<String> summaryRanges(int[] nums) {
		int min;
		List<String> ls = new ArrayList<String>();

		if(nums.length > 0) {
			min = nums[0];
			for (int i = 0; i < nums.length;i++) {
				if ((i+1 < nums.length) && (Math.abs(nums[i] - nums[i+1]) == 1)) {
					continue;
				} else {
					if(min == nums[i]) 
						ls.add(nums[i]+"");
					else 
						ls.add(min+"->"+nums[i]);
					if(i+1 < nums.length) 
						min = nums[i+1];
				}
			}
		}
		return ls;
	}
}

/*
List<String> list=new ArrayList();
    if(nums.length==1){
        list.add(nums[0]+"");
        return list;
    }
    for(int i=0;i<nums.length;i++){
        int a=nums[i];
        while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
            i++;
        }
        if(a!=nums[i]){
            list.add(a+"->"+nums[i]);
        }else{
            list.add(a+"");
        }
    }
    return list;

*/

