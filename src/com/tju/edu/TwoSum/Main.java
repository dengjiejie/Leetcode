package com.tju.edu.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {3,2,4};
		int target = 6;
		int an[] = twoSum(nums, target);
		System.out.println(an[0] +" "+ an[1]);

		
		
		
		
	}

	public static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] answer = new int[2];
		for(int i = 0; i < nums.length; i++){
			
			if( map.containsKey(target - nums[i])){
				answer[1] = i ;
				answer[0] = map.get(target-nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		
		return answer;
    }
}
