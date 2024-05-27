package com.kjhe1234.exer01;

public class SystemTimeTest_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		long a = System.nanoTime();  // 현재시간을 나노단위 1/1000000000 초
//		long b = System.currentTimeMillis(); // 현재시간을 1/1000 초
//		
//		System.out.println(a);
//		System.out.println(b);
		
		long t1 = System.currentTimeMillis(); //start time
		long n1 = System.nanoTime(); 
		
		int sum=0;
		for (int i=0;i<=100000000;i++) {  // 1~100000000까지의 합
			sum = sum +i;
			
		}
		
		long t2 = System.currentTimeMillis();  //end time
		long n2 = System.nanoTime(); 
		
		System.out.println(t2-t1); // 1~1000000까지의 합을 구하는데 걸린 시간
		System.out.println(n2-n1); 
		
	}

}
