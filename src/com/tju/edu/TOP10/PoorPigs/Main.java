package com.tju.edu.TOP10.PoorPigs;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(poorPigs(2,15,15));
	}
	//�ص�����˼�룬��ά�ȣ�ÿ��ά�ȵĳߴ�
	public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		int chicun = minutesToTest /minutesToDie + 1;
		int total = 1;
		int pigs = 0;
		while (total < buckets) {
			total *= chicun;
			pigs++;
		}
		return pigs ;
    }
}
