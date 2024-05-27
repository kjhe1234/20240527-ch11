package com.kjhe1234.exer01;

public class MathTest_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ran1 = Math.random(); // 0.0 ~ 1.0 사이의 랜덤 실수를 반환(0.0 <= ran1 < 1.0)
		
		System.out.println(ran1);
		
		//1~45 중에서 1개의 숫자를 반환
		
		int lotto1 = (int)(ran1 * 45);
		System.out.println(lotto1+1); // 1~44
		
		int dice1 = (int)(ran1 * 6);
		System.out.println(dice1+1); // 1~6
		
	}

}
