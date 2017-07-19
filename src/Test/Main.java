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
		List<Integer> haha = new ArrayList<Integer>();
		haha.add(1);
		System.out.println(haha.contains(1));
		
		
		
		
		
		
		
		
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
}
