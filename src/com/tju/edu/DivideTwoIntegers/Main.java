package com.tju.edu.DivideTwoIntegers;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime=System.nanoTime();  

		System.out.println(divide(Integer.MIN_VALUE,1));

		long endTime=System.nanoTime(); 

		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns"); 

	}
	//��ʽ dividend = divisor * num; num �����ö���������ʾ
	//=> dividend = divisor * (a0*2^0+a1*2^1+a2*2^2+.......); ֮�����ʹ�����Ƴ������õ�a0, a1, a2��
	public static int divide(int dividend, int divisor) {
		if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1 )) return Integer.MAX_VALUE;
		long  m = Math.abs((long)dividend);
		long  n = Math.abs((long)divisor);
		long num = 0;
		while (m >= n) {
			int i = 0;
			while (n << 1 <= m ) {
				i++;
				n <<= 1;
			}
			m -= n ;
			num = num + (long)Math.pow(2, i);
			n = Math.abs((long)divisor);
		}
		if((dividend < 0 && divisor > 0) ||(dividend > 0 && divisor < 0)){
			num = -num;
		}
		return (int)num;
    }
	
	
	
	
	
}
