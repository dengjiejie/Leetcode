package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> haha = new ArrayList<Integer>();
//		haha.add(1);
//		System.out.println(haha.contains(1));
		
		
		
		name();
		
		
		
		
		//threeSum();
	}
	 public static List<List<Integer>> threeSum() {
		 	List<Integer> list = new ArrayList<Integer>();
		 	Set<List<Integer>> map = new HashSet<List<Integer>>();
			List<List<Integer>> list2 = new ArrayList<List<Integer>>();

			list.add(9999);
			list.add(1111);
			Collections.sort(list);

			map.add(list);
		 	List<Integer> l = new ArrayList<Integer>();;

			l.add(9999);
			l.add(1111);

			map.add(l);
			//list2.add(list);
			//list2.add(list);
			for(List<Integer> list3 : map){
				list2.add(list3);
			}

			for(List<Integer> li : list2){
				for(int i : li)System.out.println(i);
			}
		 
		 
		 return list2;    
	 }
	 
	 public static void name() {
		int[] a = {1,3,5};
		int sum = 20;
		int[] dp = new int[21];  
		dp[0] = 0;  
		for(int i = 1; i <= sum; i++) dp[i] = i;//我们假设存在1元的硬币那么i元最多只需要i枚1元硬币，当然最好设置dp[i]等于无穷大  
		for(int i = 1; i <= sum; i++){  
			for(int j = 0; j < 3; j++){  
				if(i >= a[j] && dp[i - a[j]] + 1 < dp[i]){  
					dp[i] = dp[i- a[j] ] + 1;  
		        }  
		    }  
			System.out.println(dp[i]);

		}  
		System.out.println(dp[sum]);
	}
	 
	 
	 
}
