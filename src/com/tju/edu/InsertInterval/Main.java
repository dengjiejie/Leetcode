package com.tju.edu.InsertInterval;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> intervals = new ArrayList<Interval>();
		Interval newInterval1 = new Interval();
		newInterval1.start = 1;
		newInterval1.end = 5;
		
		
		
		
		Interval newInterval = new Interval();
		newInterval.start = 4;
		newInterval.end = 6;
		
		System.out.println(insert(intervals,newInterval));
	}

	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
//		intervals.add(newInterval);
//		int size = intervals.size();
//		int i = 1;
//		while (size - i - 1 >= 0 && intervals.get(size-i).start < intervals.get(size-i-1).start) {
//			newInterval = intervals.remove(size-i);
//			intervals.add(size-i-1, newInterval);
//			i++;
//		}
		if(intervals.size() == 0){
			intervals.add(newInterval);
			return intervals;
		}
		List<Interval> interval = new ArrayList<Interval>();
		if(newInterval.start < intervals.get(0).start){
			intervals.add(0,newInterval);
			newInterval = null;
		}
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		for(int j = 1; j < intervals.size()  ; j++) {
			if(newInterval != null && newInterval.start <= end){
				end = Math.max(newInterval.end,end);
				newInterval = null;
			}
			if(end >= intervals.get(j).start){
				end = Math.max(intervals.get(j).end,end);
				continue;
			}
			Interval newinInterval = new Interval(); 
			newinInterval.start = start;
			newinInterval.end = end;
			interval.add(newinInterval);
			
			if(newInterval != null && newInterval.start < intervals.get(j).start){
				intervals.add(j,newInterval);
				newInterval = null;
			}
			start = intervals.get(j).start;
			end = intervals.get(j).end;
		}if(newInterval != null && newInterval.start <= end){
			end = Math.max(newInterval.end,end);
			newInterval = null;
		}
		Interval newinInterval = new Interval(); 
		newinInterval.start = start;
		newinInterval.end = end;
		interval.add(newinInterval);
		if(newInterval != null)
			interval.add(newInterval);
		return interval;   
	}
	
	
	
	
	
	
}
