package com.tju.edu.MergeIntervals;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> interval = new ArrayList<Interval>();
		int start = 0;
		int end = 0;
		boolean pan = false;
		while (!intervals.isEmpty()) {
			if(!pan) {
				start = intervals.get(0).start;
				end = intervals.get(0).end;
				intervals.remove(0);
			}
			pan  = false;
			for(int i = 0; i < intervals.size(); i++){
				if((intervals.get(i).start - end)*(intervals.get(i).end - start) <= 0){
					end = Math.max(end,intervals.get(i).end);
					start = Math.min(start,intervals.get(i).start);
					intervals.remove(i);
					i--;
					pan = true;
				}
			}
			if(!pan || intervals.isEmpty()){
				Interval interval2 = new Interval(start,end);
				interval.add(interval2);
			}
		}
		return interval;   
	}
	
	
	
	
	
	
}
