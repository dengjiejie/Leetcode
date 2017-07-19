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

		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 

	}
	//公式 dividend = divisor * num; num 可以用二进制来表示
	//=> dividend = divisor * (a0*2^0+a1*2^1+a2*2^2+.......); 之后可以使用左移除数来得到a0, a1, a2等
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
