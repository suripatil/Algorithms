import java.lang.*;
import java.util.*;

/*
Pascal's Triangle
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

wo loops, one go through the row, one go through the column
calculate element value: K(i)(j)=K(i-1)(j-1)+K(i-1)(j) except for the first and last element
*/
public class PascalTriangle {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		for(int i =0; i < 5; i++) {
			nums[i][0] = 1;
			System.out.print(nums[i][0]);
			for(int j = 1; j <= i; j++) {
				nums[i][j] = nums[i-1][j-1] + nums[i-1][j];				
				System.out.print(nums[i][j]);
			}
		
			System.out.println("");
		}
	}
}

/* Leet Code Solution with List Array*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();    

        for(int i =0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j< i+1 ; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(row);
        }
        return list;
    }
}
		
